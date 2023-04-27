/** Chapter 7 Lab Exercise */
import java.util.Scanner;

public class ConditionalPractice{  
   
      
   public static void main (String[] args){
      
      //ascending order test 1
      if (inAscendingOrder(9,2,3) == true){
         System.out.println("The numbers are in ascending order");
      }
      else{
         System.out.println("The numbers are not in ascending order");
      }
      
      //ascending order test 2
      if (inAscendingOrder(3,2,1) == true){
         System.out.println("The numbers are in ascending order");
      }
      else{
         System.out.println("The numbers are not in ascending order");
      }
      
      
      
      //largest of the three test 1
      if (largestOfThree(1,2,3) == 0){
         System.out.println("At least 2 numbers are equal");
      }
      else{
         System.out.println("The largest of the three numbers is " + largestOfThree(1,2,3));
      }
      
      //largest of the three test 2
      if (largestOfThree(5,6,3) == 0){
         System.out.println("At least 2 numbers are equal");
      }
      else{
         System.out.println("The largest of the three numbers is " + largestOfThree(5,6,3));
      }
      
      //largest of the three test 3
      if (largestOfThree(9,2,1) == 0){
         System.out.println("At least 2 numbers are equal");
      }
      else{
         System.out.println("The largest of the three numbers is " + largestOfThree(9,2,1));
      }    
      
        
   }
   
   //ascending order
   public static boolean inAscendingOrder(int a, int b, int c){
      //conditionals
      if (a<b && b<c){
         return true;
      }
      else{
         return false;
      }
   }
   
   //largest
   public static int largestOfThree(int a, int b, int c){
      //conditionals 1 largest
      if (a>b && a>c){
         return a;
      }
      
      else if (b>a && b>c){
         return b;
      }
      
      else if (c>a && c>b){
         return c;
      }
      
      else {
         return 0;
      }
   }
}

