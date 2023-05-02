/**cardinal numbers*/

import java.util.Scanner;

public class cardinalNumbers{
   
   public static void main(String[]args){
   //scanning input
   Scanner sc = new Scanner(System.in); 
   System.out.println("Enter an integer: ");
   
   //run and print result of method using number inputted
   System.out.println(ordanial(sc.nextInt()));  
      
   
   } 
   
   //return ordinal number
   public static String ordanial(int number){
      //ends in 11,12,13 check have to be before 1,2,3 checkn to get right suffix
      //if ends in 11
      if (number%100 == 11){
         return (number+"th");
      }
      //if ends in 12
      else if (number%100 == 12){
         return (number+"th");
      }
      //if ends in 13
      else if (number%100 == 13){
         return (number+"th");
      }
      
      //if ends in 1
      else if (number%10 == 1){
         return (number+"st");
      }
      //if ends in 2
      else if (number%10 == 2){
         return (number+"nd");
      }
      //if ends in 3
      else if (number%10 == 3){
         return (number+"rd");
      }
      
      //any other number
      else{
         return (number+"th");
      }
   }

}
