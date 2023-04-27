import java.awt.*;

/** A class representing a tree*/
public class Tree{

   private int mid, top;// the x, y coordinate of the mid-point at the top of the trunk
   private boolean isPine;

  /** takes 2 parameters to initialise the datafields
      @param mid the x coordinate of the mid-point at the top of the trunk
      @param top the y coordinate of the mid-point at the top of the trunk
  */
   public Tree(int mid, int top,boolean isPine){
      this.mid = mid;
      this.top = top;
      this.isPine = isPine;
   }

  /** Uses the Graphics object to draw the trunk and then a series of green ovals to depict a generic tree
      @param page - a Graphics object
  */
   public void drawGeneric(Graphics page){
      page.setColor (new Color(139, 69, 19));
      page.fillRect (mid, top, 16, 60);// tree trunk hardcoded to be 16 by 60 for the sake of simplicity
      //leaves
      page.setColor (Color.green);
      page.fillOval (mid-20, top-25, 30, 30);   
      page.fillOval (mid-5, top-25, 35, 35);
      page.fillOval (mid-23, top-45, 40, 40);    
      page.fillOval (mid-13, top-45, 40, 40);    
      page.fillOval (mid-6, top-45, 40, 40);   
      page.fillOval (mid-10, top-55, 40, 40);  
      page.fillOval (mid, top-55, 30, 30);    
      
   }    
   public void drawPine(Graphics page){
      //trunk
      page.setColor (new Color(139, 69, 19));
      page.fillRect (mid - 8, top, 16, 60);
      //leaves x 3
      page.setColor (Color.green);
      int[] xPoints1 = {mid -15, mid +15, mid};
      int[] yPoints1 = {top-30, top-30, top - 60};
      page.fillPolygon(xPoints1, yPoints1, 3);
      
      int[] xPoints2 = {mid -25, mid +25, mid};
      int[] yPoints2 = {top-5, top-5, top - 40};
      page.fillPolygon(xPoints2, yPoints2, 3);
      
      int[] xPoints3 = {mid -35, mid +35, mid};
      int[] yPoints3 = {top + 20, top + 20, top - 25};
      page.fillPolygon(xPoints3, yPoints3, 3);
   }
   //draw method
   public void draw(Graphics pass){
      //if not pine
      if (isPine == false){
         drawGeneric(pass);
      }
      //if pine
      if (isPine == true){ 
         drawPine(pass);
      }
   }

}