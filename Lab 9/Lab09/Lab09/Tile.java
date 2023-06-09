import javax.swing.*;
import java.awt.*;
/**A decorative tile*/
public class Tile extends JPanel{


   private static int curveFactor = 3;
   
   private static int width = 200;
   private static int height = 200;
   
   private Color colour;
   
   /**Initialises the colour and the dimensions of this tile object*/
   public Tile(Color c){
      colour = c;
      setPreferredSize(new Dimension(width,height));
   }
   
   /** Takes a reference to a Color object and assigns it to the colour datafield*/
   public void setColour(Color c){
      colour = c;
   }
   
   public static int setWidth(int w){
      width = w;
      return w;
   }
   
   public static int setHeight(int h){
      height = h;
      return h;
   }
   
   /** Takes a reference to a Graphics object and paints a decorative tile*/
   public void paintComponent(Graphics g){
//       int width = 200;
//       int height = 200;
      g.setColor(colour);
      g.fillArc(-width/curveFactor, -height/curveFactor, 2*width/curveFactor, 2*height/curveFactor, 270, 90);
      g.fillArc(-width/curveFactor, height - height/curveFactor, 2*width/curveFactor, 2*height/curveFactor, 0, 90);
      g.fillArc(width - width/curveFactor, -height/curveFactor, 2*width/curveFactor, 2*height/curveFactor, 180, 90);
      g.fillArc(width - width/curveFactor, height - height/curveFactor, 2*width/curveFactor, 2*height/curveFactor,90, 90);
      g.fillRect(width/2 - 3, 0, 6, height);
      g.fillRect(0, height/2 - 3,  width, 6);
   }
}