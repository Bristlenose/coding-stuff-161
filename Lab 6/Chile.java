import javax.swing.*;
import java.awt.*;

public class Chile extends JPanel{

   public Chile(){
      setPreferredSize(new Dimension(500, 300));
   
   }

   public void paintComponent(Graphics g){
      super.paintComponent(g); 
      g.setColor(Color.white); 
      
      g.fillOval(10, 40, 100, 100);
      
      g.setColor(Color.black);
      g.fillOval(35, 65, 10, 10);//left eye
      g.fillOval(75, 65, 10, 10);//right eye
      
      g.drawArc(20, 70, 80, 50, 200, 140);


   
   }
}