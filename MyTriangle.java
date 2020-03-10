package Домашка.com;

public class MyTriangle {
    private MyPoint v1=new MyPoint();
    private MyPoint v2=new MyPoint();
    private MyPoint v3=new MyPoint();

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1.setX(x1);
        this.v2.setX(x2);
        this.v3.setX(x3);
        this.v1.setY(y1);
        this.v2.setY(y2);
        this.v3.setY(y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                '}';
    }
    public double getPerimeter(){
        double a = v1.distanceToAnotherPoint(v2);
        double b = v2.distanceToAnotherPoint(v3);
        double c = v3.distanceToAnotherPoint(v1);
        return a+b+c;
    }
    public String getType(){
        double a = v1.distanceToAnotherPoint(v2);
        double b = v2.distanceToAnotherPoint(v3);
        double c = v3.distanceToAnotherPoint(v1);
        if( a==b && a!=c || a==c && a!=b || b==c && b!=a){
            return "Isosceles";
        }
        if(a==b&&a==c) {
            return "Equilateral";
        }
        return "Versatile";
    }
}
