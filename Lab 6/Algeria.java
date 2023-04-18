import javax.swing.*;
import java.awt.*;

public class Algeria extends JPanel{
   private Color bg;
   
   public Algeria(){
      setPreferredSize(new Dimension(500, 300));
   
   }

   public void paintComponent(Graphics g){
      super.paintComponent(g); 
      
      Color silver = new Color(192, 192, 192);
      
      Moon m = new Moon(200, 10, 50, 50, silver, bg);     
      m.draw(g);
      
      Star star1 = new Star(340, 45, 20, silver, 5);
      star1.draw(g);
   
   }
}