/**  Lab 5 BoxApp.java */
public class BoxApp{
   public static void main(String[]args){
   Box b1 = new Box(2.5);
   System.out.println("Box 1 has a area of "+ b1.getArea());
   
   Box b2 = new Box(2,2,3);
   System.out.println("Box 2 has a volume of "+ b2.getVolume());
   }
}