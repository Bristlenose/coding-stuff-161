import java.awt.Point;

/** A class to create and manage Point objects*/
public class PointApp{
   public static void main(String[] args){
      Point point1 = new Point(4, 2);
      Point point2 = new Point(13, 8);
      System.out.println("(" + point1.getX() + ", " + point1.getY() + ")");
      System.out.println("(" + point2.getX() + ", " + point2.getY() + ")"); 
   }
}