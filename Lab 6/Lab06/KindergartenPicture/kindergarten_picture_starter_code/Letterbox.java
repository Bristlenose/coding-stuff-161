import java.awt.*;

/** A class representing a tree*/
public class Letterbox{

   private int mid, top;// the x, y coordinate of the mid-point at the top of the trunk
   
   private Color boxColour;
   private String houseNumber; 

  /** takes 2 parameters to initialise the datafields
      @param mid the x coordinate of the mid-point at the top of the trunk
      @param top the y coordinate of the mid-point at the top of the trunk
  */
   public Letterbox(int mid, int top, Color boxColour, String houseNumber){
      this.mid = mid;
      this.top = top;
      this.boxColour = boxColour;
      this.houseNumber = houseNumber;
   }

  /** Uses the Graphics object to draw the trunk and then a series of green ovals to depict a generic tree
      @param page - a Graphics object
  */
   public void draw(Graphics page){
      //base post
      page.setColor (new Color(139, 69, 19));
      page.fillRect (mid, top, 12, 18);// tree trunk hardcoded to be 16 by 60 for the sake of simplicity
      
      //box
      page.setColor (boxColour);
      page.fillRect (mid-9, top-18, 30, 22);// tree trunk hardcoded to be 16 by 60 for the sake of simplicity
      
      //slot
      page.setColor (Color.black);
      page.fillRect (mid-2, top-13, 16, 5);// tree trunk hardcoded to be 16 by 60 for the sake of simplicity
      
      page.drawArc(mid - 10, top - 25, 30, 20, 10, 160);
      
      page.drawString(houseNumber, mid-1,top+2);
      
   }    
}