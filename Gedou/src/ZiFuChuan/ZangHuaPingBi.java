package ZiFuChuan;

public class ZangHuaPingBi {
    public static void main(String[] args) {
        //脏话屏蔽
        String talk="你玩的真菜,大SB，TMD";
        // 定义一个敏感词数组
        String[] arr={"SB","TMD","CNM","MLGB"};
        //将敏感词替换为***
        //循环得到每一个敏感词
        for (int i = 0; i < arr.length; i++) {
           talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
