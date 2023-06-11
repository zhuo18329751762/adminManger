package Test.Test13_11;

public  class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
     double size;
    Octagon(){
        super();
    }
    Octagon(double size){
        this.size=size;
    }
    @Override
    public double getArea() {
        return (2+4/Math.sqrt(2))*size*size;
    }
    @Override
    public double getPerimeter() {
        return size*8;
    }

    @Override
    public int compareTo(Octagon o) {
       if(o.getArea()==this.getArea()){
           return 0;
       }else if(o.getArea()>this.getArea()){
           return 1;
       }else{
           return -1;
       }
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
