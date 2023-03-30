import java.util.Scanner;

/** A class that demonstrates Carl Gauss's ethod for adding up integer values in a sequence*/
public class GaussApp{
   
   public static void main(String[] args){
      //initalises scanner
      Scanner sc = new Scanner(System.in);
      
      //get upper limit
      System.out.println("Please enter the upper limit:");
      int upperLimit = sc.nextInt();
      
      //call add sequence method
      int sum = addSequence(upperLimit);
      
      //print output
      System.out.println("The sum of all intergers between 1 and "+ upperLimit +" inclusive is " + sum);
   }

   public static int addSequence(int upLimit){
      //converts in to double
      double limit = upLimit;
      //does formula to get answer
      double formula = ((limit)/2)*(limit+1);
      //converts double back to int and returns int answer
      int sum = (int)formula; 
      return sum;  
   }
}
