package tnsbasic.day4.package1;

public class PointDemo {
    public static void main(String[] args) {
        Point p1=new Point();
        //p1.x=5.75f cannot access private member
        p1.show();
        Point p2=new Point(0.75f);
        p2.show();
        Point p3=new Point(2.5f,3.7f);
        p3.show();
    }
}
