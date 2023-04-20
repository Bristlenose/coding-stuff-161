import javax.swing.*;
import java.awt.*;

public class Georgia extends JPanel{
   private Color bg;
   
   public Georgia(){
      setPreferredSize(new Dimension(500, 300));
   
   }

   public void paintComponent(Graphics g){
      super.paintComponent(g); 
      //background
      g.setColor(Color.white);
      g.fillRect(0, 0, 500, 300);
      
      //main cross
      g.setColor(Color.red);
      g.fillRect(0, 125, 500, 50);
      g.fillRect(225, 0, 50, 300);
      
      //side crosses
      g.setColor(Color.red);
      g.fillRect(100, 30, 20, 60);
      g.fillRect(80, 50, 60, 20);
      
      g.fillRect(100, 210, 20, 60);
      g.fillRect(80, 230, 60, 20);
      
      g.fillRect(370, 30, 20, 60);
      g.fillRect(350, 50, 60, 20);
      
      g.fillRect(370, 210, 20, 60);
      g.fillRect(350, 230, 60, 20);
      

      
      
   
   }
}