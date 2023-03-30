/** Exercise 5*/

import java.util.Scanner;

public class PizzaPerfecter{
   public static void main(String[]args){
      
      //return angle
      int angle = slices( "Please enter the number of pizza slices you would like:" );
      System.out.println("Each slice will arc through "+angle+" degrees.");
      
      
   
   } 
   
   //angle for required slices method
   public static int slices(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      int slice = sc.nextInt();
      return (360/slice);
   }
}