package youxi;
import java.util.Random;
public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//长相随机
    String[] boyFace={"风流倜傥","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlFace={"美奂绝伦","沉鱼落雁","亭亭玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    //攻击描述
    String[] attacks_desc= {
            "%s使出了【黑虎掏心】,跳起后向着面前不远处的%s造成巨大物理伤害。",
            "%s使出了【泰山压顶】,跳起后压向%s，可以闪避。可以用于跳过障碍物。",
            "%s使出了【螳螂拳】,以双轻拳攻击%s，造成少量物理伤害。",
            "%s使出了【大象踢腿】,对前方中近距离的%s造成巨大真实伤害。",
            "%s使出了【小鱼水中游】,摆出优雅姿势，对目标嘲讽。"
    };
    //受伤描述
    String[] injureds={
            "结果%s退了半步，毫发无损",
            "结果%s造成了一处淤伤",
            "结果一击命中，%s疼的弯下腰",
            "结果%s痛苦的闷哼一声，显然受了内伤",
            "结果%s摇摇晃晃，一跌摔倒在地",
            "结果噗的一声，%s口中鲜血狂喷",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相随机
        Random r=new Random();
        if(gender=='男') {
            int i=r.nextInt(boyFace.length);
            this.face=boyFace[i];
        }else if(gender=='女'){
            int i=r.nextInt(girlFace.length);
            this.face=girlFace[i];
        }else {
            this.face = "面目狰狞";
        }
    }

    public String[] getBoyFace() {
        return boyFace;
    }

    public void setBoyFace(String[] boyFace) {
        this.boyFace = boyFace;
    }

    public String[] getGirlFace() {
        return girlFace;
    }

    public void setGirlFace(String[] girlFace) {
        this.girlFace = girlFace;
    }

    public Role() {
    }
    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender=gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //方法的调用者去攻击
    public void attack(Role role){
        Random r=new Random();
        int i=r.nextInt(attacks_desc.length);
        String kungFu=attacks_desc[i];
        //输出攻击效果
        System.out.printf(kungFu,this.getName(),role.getName());
        //计算造成的伤害
        int att=r.nextInt(20)+1;
        //修改挨揍人的血量
        int remainBoold= role.getBlood()-att;
        //对剩余血量做一个验证
        remainBoold=remainBoold>0?remainBoold:0;
        role.setBlood(remainBoold);
        //受伤描述
        if(remainBoold>90){
            System.out.printf(injureds[0],role.getName());
        }else if(remainBoold>80){
            System.out.printf(injureds[1],role.getName());
        }else if(remainBoold>70){
            System.out.printf(injureds[2],role.getName());
        }else if(remainBoold>60){
            System.out.printf(injureds[3],role.getName());
        }else if(remainBoold>40){
            System.out.printf(injureds[4],role.getName());
        }else if(remainBoold>10){
            System.out.printf(injureds[5],role.getName());
        }else if(remainBoold==0){
            System.out.printf(injureds[6],role.getName());
        }
        System.out.println();
    }
    public void showRoleInfo(){
        System.out.println("姓名为:"+getName());
        System.out.println("血量为:"+getBlood());
        System.out.println("性别为:"+getGender());
        System.out.println("容貌为:"+getFace());
    }
}
