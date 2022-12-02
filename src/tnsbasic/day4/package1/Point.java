package tnsbasic.day4.package1;

public class Point {
        private float x;
        private float y;
        public Point(){
          x=0.0f;
          y=0.0F;
            System.out.println("Default constructor");
        }
        public Point(float v){
            x=v;
            y=v;
        }

        public Point(float x1,float y1)
        {
            x=x1;
            y=y1;
        }
public void show(){

    System.out.println("Point ("+x+","+y+")");


}
    }


