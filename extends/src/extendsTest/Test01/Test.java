package extendsTest.Test01;

public class Test {
    public static void main(String[] args) {
        //布偶猫
        BuOuCat b=new BuOuCat();
        b.name="布偶猫";
        b.eat();
        b.drink();
        b.ZhuaLaoShu();
        System.out.println();
        //狸花猫
        LiHuaCat l=new LiHuaCat();
        l.name="狸花猫";
        l.eat();
        l.drink();
        l.ZhuaLaoShu();
        System.out.println();
        //哈士奇
        HaShiQi h=new HaShiQi();
        h.name="哈士奇";
        h.eat();
        h.drink();
        h.KanJia();
        h.ChaiJia();
        System.out.println();
        //泰迪
        TaiDi t=new TaiDi();
        t.name="泰迪";
        t.eat();
        t.drink();
        t.KanJia();
        t.CengYiCeng();
    }


}
