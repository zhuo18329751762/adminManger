package game;

import domain.User;
import util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class LoginJFrame extends JFrame implements MouseListener {
        //登录界面

        //创建一个集合存储正确的用户名的密码
        static ArrayList<User> list=new ArrayList<User>();
        static {
            list.add(new User("zhangsan","123"));
            list.add(new User("lisi","1234"));
        }

        //登录按钮
        JButton login = new JButton();
        //注册按钮
        JButton register = new JButton();
        //用户名输入按钮
        JTextField username = new JTextField();
        //密码输入按钮
        JPasswordField password = new JPasswordField();
        //验证码输入框
        JTextField code = new JTextField();
        //正确的验证码
        JLabel rightCode=new JLabel();
        //验证码
        String codeStr= CodeUtil.getCode();

        public LoginJFrame(){
            //初始化界面
            initJFrame();
            //添加内容
            initView();
            //让界面显示出来
            this.setVisible(true);
        }

        private void initJFrame() {
            //在创建登录界面时 同时给这个界面设置一些信息
            this.setSize(633,423);
            //设置界面标题
            this.setTitle("斗地主  登录");
            //设置界面置顶
            this.setAlwaysOnTop(true);
            //设置界面居中
            this.setLocationRelativeTo(null);
            //设置关闭模式
            this.setDefaultCloseOperation(3);
            //取消内部默认布局
            this.setLayout(null);
        }

        public void initView() {
            // 1 添加用户名文字
            Font usernameFont=new Font(null,1,16);
            JLabel usernameText=new JLabel("用户名");
            usernameText.setForeground(Color.white);
            usernameText.setFont(usernameFont);
            usernameText.setBounds(140,55,55,22);
            this.getContentPane().add(usernameText);
            // 2 添加用户名输入框
            username.setBounds(223, 46, 200, 30);
            this.getContentPane().add(username);
            // 3 添加密码文字
            JLabel passwordText=new JLabel("密码");
            Font passwordFont=new Font(null,1,16);
            passwordText.setForeground(Color.white);
            passwordText.setFont(passwordFont);
            passwordText.setBounds(197,95,40,22);
            this.getContentPane().add(passwordText);
            // 4 密码输入框
            password.setBounds(263, 87, 160, 30);
            this.getContentPane().add(password);
            //验证码提示
            JLabel codeText=new JLabel("验证码");
            Font codeFont=new Font(null,1,16);
            codeText.setForeground(Color.white);
            codeText.setFont(codeFont);
            codeText.setBounds(215,142,55,22);
            this.getContentPane().add(codeText);
            //验证码输入框
            code.setBounds(291, 133, 100, 30);
            this.getContentPane().add(code);
            //获取正确的验证码
            Font rightCodeFont=new Font(null,1,15);
            //设置颜色
            rightCode.setForeground(Color.RED);
            //设置字体
            rightCode.setFont(rightCodeFont);
            //设置内容
            rightCode.setText(codeStr);
            //绑定鼠标事件
            rightCode.addMouseListener(this);
            //设置位置和宽高
            rightCode.setBounds(400, 133, 100, 30);
            //添加到界面
            this.getContentPane().add(rightCode);

            // 5 添加登录按钮
            login.setBounds(123, 310, 128, 47);
            login.setIcon(new ImageIcon("farmerandlord\\image\\login\\登录按钮.png"));
            login.addMouseListener(this);
            //去除按钮的默认边框
            login.setBorderPainted(false);
            //去除按钮的背景
            login.setContentAreaFilled(false);
            this.getContentPane().add(login);
            // 6 添加注册按钮
            register.addMouseListener(this);
            register.setBounds(256, 310, 128, 47);
            register.setIcon(new ImageIcon("farmerandlord\\image\\login\\注册按钮.png"));
            //去除按钮的默认边框
            register.setBorderPainted(false);
            //去除按钮的背景
            register.setContentAreaFilled(false);
            this.getContentPane().add(register);
            // 7 添加背景图片
            JLabel backGround = new JLabel(new ImageIcon("farmerandlord\\image\\login\\background.png"));
            backGround.setBounds(0, 0, 633, 423);
            this.getContentPane().add(backGround);
        }
        //要展示用户名或者密码错误
        public void showJDialog(String content){
            //创建一个弹框对象
            JDialog jDialog=new JDialog();
            //给弹窗设置大小
            jDialog.setSize(200,150);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭无法操作下面的界面
            jDialog.setModal(true);
            //创建JLabel对象管理文字并添加到弹框之中
            JLabel warning=new JLabel(content);
            warning.setBounds(0,0,200,150);
            jDialog.getContentPane().add(warning);
            //让弹框显示出来
            jDialog.setVisible(true);

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("按钮被点击");
            if (e.getSource() == login) {
                String name = username.getText();
                String passWord = password.getText();
                //获取用户输入的验证码
                String code = this.code.getText();
                //创建一个User对象
                User userInfo = new User(name, passWord);
                System.out.println("用户输入的用户名为" + name);
                System.out.println("用户输入的密码为" + passWord);
                if (code.length() == 0) {
                    showJDialog("验证码不能为空");
                } else if (name.length() == 0 || passWord.length() == 0) {
                    System.out.println("用户名或密码为空");
                    showJDialog("用户名或密码为空");
                } else if (!code.equals(codeStr)) {
                    System.out.println("验证码输入错误");
                    showJDialog("验证码输入错误");
                } else if (contains(userInfo)) {
                    System.out.println("登陆成功");
                    //关闭当前登录界面
                    this.setVisible(false);
                    new GameJFrame();
                } else {
                    showJDialog("密码输入错误");
                }

            } else if (e.getSource() == register) {
                showJDialog("注册功能暂未开放");
            } else if(e.getSource()==rightCode){
                System.out.println("更换验证码");
                String str=CodeUtil.getCode();
                rightCode.setText(str);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("鼠标按下");
            if (e.getSource() == login) {
                login.setIcon(new ImageIcon("farmerandlord\\image\\login\\登录按下.png"));
            } else if (e.getSource() == register) {
                register.setIcon(new ImageIcon("farmerandlord\\image\\login\\注册按下.png"));
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("鼠标松开");
            if (e.getSource() == login) {
                login.setIcon(new ImageIcon("farmerandlord\\image\\login\\登录按钮.png"));
            } else if (e.getSource() == register) {
                register.setIcon(new ImageIcon("farmerandlord\\image\\login\\注册按钮.png"));
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
        public boolean contains(User user) {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getUsername().equals(user.getUsername())
                        &&list.get(i).getPassword().equals(user.getPassword())){
                    return true;
                }
            }
            return false;
        }

    }
