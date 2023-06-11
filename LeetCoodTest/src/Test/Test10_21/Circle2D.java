package Test.Test10_21;

public class Circle2D {
    private double x;
    private double y;
    private double radius;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Circle2D(){
        x=0;
        y=0;
        radius=1;
    }
    public Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*2;
    }
    public boolean contains(double x,double y){
        double num=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        if(num<this.radius){
            return true;
        }
        return false;
    }
    public boolean contains(Circle2D circle2D){
        double dis=Math.sqrt(Math.pow(this.x- circle2D.x,2)+Math.pow(this.y- circle2D.y,2));
        if(dis<Math.abs(circle2D.radius-this.radius)){
            return true;
        }
        return false;
    }
    public boolean overlaps(Circle2D circle2D){
        double num=Math.sqrt(Math.pow(circle2D.x-x,2)+Math.pow(circle2D.y-y,2));
        if(num< circle2D.radius+radius&&num>Math.abs(circle2D.radius-this.radius)){
            return true;
        }
        return false;
    }
}
