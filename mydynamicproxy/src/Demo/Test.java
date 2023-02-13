package Demo;

public class Test {
    public static void main(String[] args) {
          /*
    需求：
    外面的人想要大明星唱一首歌
    1 获取代理的对象
    ProxyUtil.createProxy(大明星的对象)
    2 在调用代理的唱歌方法
        代理对象，唱歌的方法("只因你太美");
     */
        // 1 获取代理对象
        BigStar bigStar=new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bigStar);
        // 2 调用代理的唱歌方法
        String result = proxy.sing("只因你太美");
        System.out.println(result);
        proxy.dance();

    }
}
