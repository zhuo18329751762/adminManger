package game;

import domain.Poker;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GameJFrame extends JFrame implements ActionListener {
    //获取界面中的隐藏容器
    //现在统一获取了，后面直接用就可以了
    public static Container container = null;

    //管理抢地主和不抢两个按钮
    JButton[]  landlord= new JButton[2];

    //管理出牌和不要两个按钮
    JButton[] publishCard = new JButton[2];

    //游戏界面中地主的图标
    JLabel dizhu;
    //三个玩家前方的文本提示
    //0索引：左边的电脑玩家
    //1索引：中间的自己
    //2索引：右边的电脑玩家
    JTextField time[] = new JTextField[3];


    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装着每一个玩家当前要出的牌
    //0索引：左边的电脑玩家
    //1索引：中间的自己
    //2索引：右边的电脑玩家
    ArrayList<ArrayList<Poker>> currentList = new ArrayList<>();

    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装着每一个玩家的牌
    //0索引：左边的电脑玩家
    //1索引：中间的自己
    //2索引：右边的电脑玩家
    ArrayList<ArrayList<Poker>> playerList = new ArrayList<>();
    //牌盒，装所有牌
    ArrayList<Poker> pokerList=new ArrayList<>();
    //底牌
    ArrayList<Poker> lordList = new ArrayList<>();
    public GameJFrame() {
        //设置图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("farmerandlord\\image\\dizhu.png"));
        //设置界面
        initJframe();
        //添加组件
        initView();
        //界面显示出来
        //先展示界面再发牌，因为发牌里面有动画，界面不展示出来，动画无法展示
        this.setVisible(true);

        //初始化牌
        //准备牌，洗牌，发牌，排序
        initCard();
    }

    private void initCard() {
        //准备牌
        //把所有的牌，包括大小王都添加到cardList当中
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 13; j++) {
                if((i==5)&&(j>2)){
                    break;
                }else{
                    Poker poker=new Poker(i+"-"+j,false);
                    poker.setLocation(350,150);
                    pokerList.add(poker);
                    container.add(poker);
                }
            }
        }
        //洗牌
        Collections.shuffle(pokerList);
        //创建三个集合用来装三个玩家的牌，并把三个小集合放到大集合中方便管理
        ArrayList<Poker> player0=new ArrayList<>();
        ArrayList<Poker> player1=new ArrayList<>();
        ArrayList<Poker> player2=new ArrayList<>();
        //发牌
        for (int i = 0; i < pokerList.size(); i++) {
            //获取当前遍历的牌
            Poker poker=pokerList.get(i);
            //发三张底牌
            if(i<=2){
                //把底牌添加到集合中
                lordList.add(poker);
                Common.move(poker,poker.getLocation(),new Point(270+(75*i),10));
                continue;
            }
            //给三个玩家发牌
            if(i%3==0){
                //给左边的电脑发牌
                Common.move(poker,poker.getLocation(),new Point(50,60+i*5));
                player0.add(poker);
            }else if(i%3==1){
                //给中间的自己发牌
                Common.move(poker,poker.getLocation(),new Point(180+7*i,450));
                player1.add(poker);
                //把自己的牌展示为正面
                poker.turnFront();
            }else if(i%3==2){
                //给右边的电脑发牌
                Common.move(poker,poker.getLocation(),new Point(700,60+i*5));
                player2.add(poker);
            }
            //把三个装着牌的小集合放到大集合中方便管理
            playerList.add(player0);
            playerList.add(player1);
            playerList.add(player2);
            //把当前的牌置于最顶端，这样就会有牌依次错开且叠起来的效果
            container.setComponentZOrder(poker,0);
        }
        //排序
        for (int i = 0; i < 3; i++) {
            order(playerList.get(i));
            Common.rePosition(this,playerList.get(i),i);
        }
    }
    public void order(ArrayList<Poker> list){
        //利用牌的价值进行排序
        Collections.sort(list, new Comparator<Poker>() {
            //Array.sort(插入排序+二分查找)
            @Override
            public int compare(Poker o1, Poker o2) {
                //负数：o1小 插入到前面
                //正数：o1大 插入到后面
                //0：o1与o2的数字一样，需要按照花色再次排序
                // 1 计算o1的花色和价值
                int color1 = Integer.parseInt(o1.getName().substring(0,1));
                int value1 = getValue(o1);
                // 2 计算o2的花色和价值
                int color2 = Integer.parseInt(o2.getName().substring(0,1));
                int value2 = getValue(o2);

                //倒序排序
                int flag=value2-value1;
                //如果牌的价值一样，按照花色排序
                if(flag==0){
                    return color1-color2;
                }else{
                    return flag;
                }
            }
        });
    }
    public int getValue(Poker poker){
        //获取牌的名字
        String name=poker.getName();
        //获取牌的花色
        int color=Integer.parseInt(name.substring(0,1));
        //获取牌的数字，也是牌的价值
        int value=Integer.parseInt(name.substring(2));
        //3~k对应的数字二，可以视为牌的价值
        //所以，我们单独判断大小王，A，2即可

        //计算大小王的价值
        if(color==5){
            return value+=50;
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }

    //添加组件
    public void initView() {
        //创建抢地主的按钮
        JButton robBut = new JButton("抢地主");
        //设置位置
        robBut.setBounds(320, 400, 75, 20);
        //添加点击事件
        robBut.addActionListener(this);
        //设置隐藏
        robBut.setVisible(false);
        //添加到数组中统一管理
        landlord[0] = robBut;
        //添加到界面中
        container.add(robBut);

        //创建不抢的按钮
        JButton noBut = new JButton("不     抢");
        //设置位置
        noBut.setBounds(420, 400, 75, 20);
        //添加点击事件
        noBut.addActionListener(this);
        //设置隐藏
        noBut.setVisible(false);
        //添加到数组中统一管理
        landlord[1] = noBut;
        //添加到界面中
        container.add(noBut);

        //创建出牌的按钮
        JButton outCardBut = new JButton("出牌");
        outCardBut.setBounds(320, 400, 60, 20);
        outCardBut.addActionListener(this);
        outCardBut.setVisible(false);
        publishCard[0] = outCardBut;
        container.add(outCardBut);

        //创建不要的按钮
        JButton noCardBut = new JButton("不要");
        noCardBut.setBounds(420, 400, 60, 20);
        noCardBut.addActionListener(this);
        noCardBut.setVisible(false);
        publishCard[1] = noCardBut;
        container.add(noCardBut);


        //创建三个玩家前方的提示文字：倒计时
        //每个玩家一个
        //左边的电脑玩家是0
        //中间的自己是1
        //右边的电脑玩家是2
        for (int i = 0; i < 3; i++) {
            time[i] = new JTextField("倒计时:");
            time[i].setEditable(false);
            time[i].setVisible(false);
            container.add(time[i]);
        }
        time[0].setBounds(140, 230, 60, 20);
        time[1].setBounds(374, 360, 60, 20);
        time[2].setBounds(620, 230, 60, 20);


        //创建地主图标
        dizhu = new JLabel(new ImageIcon("farmerandlord\\image\\dizhu.png"));
        dizhu.setVisible(false);
        dizhu.setSize(40, 40);
        container.add(dizhu);
    }

    //设置界面
    public void initJframe() {
        //设置标题
        this.setTitle("斗地主");
        //设置大小
        this.setSize(830, 620);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口无法进行调节
        this.setResizable(false);
        //界面居中
        this.setLocationRelativeTo(null);
        //获取界面中的隐藏容器，以后直接用无需再次调用方法获取了
        container = this.getContentPane();
        //取消内部默认的居中放置
        container.setLayout(null);
        //设置背景颜色
        container.setBackground(Color.LIGHT_GRAY);
    }
}
