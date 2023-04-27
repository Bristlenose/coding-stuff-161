import javax.swing.*;
import java.awt.*;

public class Flags{
   public static void main(String[]args){
      //creates window
      JFrame frame = new JFrame("Some JPanels"); 
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());
      
      //flag 1
      Georgia smiley = new Georgia();
      frame.getContentPane().add (smiley);
      
      //flag 2
      Chile smiley2 = new Chile();
      frame.getContentPane().add (smiley2);
      
      //add to window
      frame.getContentPane().add (smiley);
      frame.getContentPane().add (smiley2);
      
      //show window
      frame.pack();
      frame.setVisible(true);
      
   }
}
     