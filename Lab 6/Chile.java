import javax.swing.*;
import java.awt.*;

public class Chile extends JPanel{

   public Chile(){
      setPreferredSize(new Dimension(500, 300));
   
   }

   public void paintComponent(Graphics g){
      super.paintComponent(g); 
      
      //set color for star
      Color white = Color.white;
      
      //set rectangle sizes and colours
      g.setColor(Color.red);
      g.fillRect(0, 150, 500, 150);
      
      g.setColor(Color.blue);
      g.fillRect(0, 0, (500/3), 150);
      
      g.setColor(Color.white);
      g.fillRect((500/3), 0, (1000/3), 150);
      
      //make star(used predone one from earlie
      Star star1 = new Star(75, 75, 30, white, 5);
      star1.draw(g);


   
   }
}