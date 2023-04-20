/** Chapter 7 Lab Exercise */
public class Size{

   public static void main(String[] args){
      printSize(5);
      printSize(25);
      printSize(75);
      printSize(500);
      printSize(5000);
   }
   
   /** method prints out a message according to size of number
   */
   public static void printSize(int num){
      System.out.print(num + " is ");
      if (num < 20){
         System.out.println( "small");
      }
      if(num >= 20 && num < 50){
         System.out.println( "medium");
      }
      if(num >= 50 && num <1000){
         System.out.println("big"); 
      }
      if(num >=1000){
         System.out.println( "huge");
      }
   }  
}
