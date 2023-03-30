import javax.swing.*;
import java.awt.*;
 /** Lab 06 extended JPanel with Graphics capability*/
public class SmileyPanel extends JPanel{
  /** constructor takes a colour and some text, and uses them in the setup*/
   public SmileyPanel(Color bgCol,  String labelText){
   
      setBackground(bgCol);
      setPreferredSize(new Dimension(120, 200));
      // make a new JLabel using the text, and add the JLabel to the SmileyPanel
      add(new JLabel(labelText)); 
   
   }
/** paintComponent method -  notice the super.paintComponent(g) statement which much come first,
and the origin and use of the g variable. Copy these things when you write your
own paintComponent methods */
   public void paintComponent(Graphics g){
      super.paintComponent(g); 
      g.setColor(Color.yellow); 
      
      g.fillOval(10, 40, 100, 100);
      
      g.setColor(Color.black);
      g.fillOval(35, 65, 10, 10);//left eye
      g.fillOval(75, 65, 10, 10);//right eye
      
      g.drawArc(20, 70, 80, 50, 200, 140);


   
   }
}