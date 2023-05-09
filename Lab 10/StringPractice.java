/**String practice*/
public class StringPractice{
   public static void main(String[] args){
      String fact1 = "Paris is the capital of France!";
      String fact2 = "The capital of Italy is Roma.";
      
      //assign the length of a String named fact1 to an int variable
      int stringLength = fact1.length();
      //display (don't store) the length of the String named fact1
      System.out.println(fact1.length());
      
      //print the character at index 7
      System.out.println(fact1.charAt(7));
      
      //print the first and last characters
      System.out.println(fact1.charAt(0) + " " +fact1.charAt(fact1.length()-1));
      
      //print the character at non-existent index
      //System.out.println(fact1.charAt(-1));
      
      
      int firstE = fact1.indexOf('e');
      int secondE = fact1.indexOf('e', firstE + 1);
      System.out.println("1st e index: " + firstE);
      System.out.println("2nd e index: " + secondE);

   }
}