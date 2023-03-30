/** Exercise 2*/

import java.util.Scanner;

public class MyTools{
   public static void main(String[]args){
      //return interger
      int i = readInt( "Please enter a integer:" );
      System.out.println( "You entered: " + i );
      
      //return double
      double d = readDouble( "Please enter a double:" );
      System.out.println( "You entered: " + d );
      
      //return Token
      String t = readToken( "Please enter a Token:" );
      System.out.println( "You entered: " + t );
      
      //return interger
      String s = readString( "Please enter a String:" );
      System.out.println( "You entered: " + s );
      
      
   
   } 
   
   //interger method
   public static int readInt(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      return sc.nextInt();
   }
   //double method
   public static double readDouble(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      return sc.nextDouble();
   }
   
   //token method
   public static String readToken(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      return sc.next();
   }
   
   //string method
   public static String readString(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      return sc.nextLine();
   }
   
   
   
   
    
}