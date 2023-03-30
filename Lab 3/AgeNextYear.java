/** Exercise 5 Lab 3*/

import java.util.Scanner;

public class AgeNextYear{

   public static void main(String[]args){
   
      //Set scanner
      Scanner scan = new Scanner(System.in);
      
      //Assigning variables
      String name;
      int age;
      
      //Set occasion
      System.out.println("Enter your name: ");
      name = scan.nextLine();
      
      //Set occasion
      System.out.println("Enter your current age: ");
      age = scan.nextInt();
      
      //call age next year method
      showAgeNextYear(name,age);
      
   }
   //Print name and age next year
   public static void showAgeNextYear(String name,int age){
      System.out.println("Hello "+ name +", you are "+ age +" years old. Next year you will be "+(age+1)+".");

   }
}