import javax.swing.*;
import java.awt.*;

public class Flags{
   public static void main(String[]args){
      JFrame frame = new JFrame("Some JPanels"); 
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());
      
      Georgia smiley = new Georgia();
      frame.getContentPane().add (smiley);
      
      Chile smiley2 = new Chile();
      frame.getContentPane().add (smiley2);
      
      frame.getContentPane().add (smiley);
      frame.getContentPane().add (smiley2);
      
      frame.pack();
      frame.setVisible(true);
      
   }
}