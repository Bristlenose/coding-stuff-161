/** Exercise 2*/

import java.util.Scanner;
import java.util.Random;


public class MyTools{
   
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
   public static String readLine(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      return sc.nextLine();
   }
   
   
   
   /** this is added in lab 9 */
      
      
      
   
   //interger method
   public static int readInt(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a integer:");
      return sc.nextInt();
   }
   //double method
   public static double readDouble(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a Double:");
      return sc.nextDouble();
   }
   
   //token method
   public static String readToken(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a Token:");
      return sc.next();
   }
   
   //string method
   public static String readLine(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a String:");
      return sc.nextLine();
   }
   
   //random range
   public static int randomInRange(int high,int low){
      Random r = new Random();
      int result = r.nextInt(high-low+1)+low;
      System.out.println(result);
      return result;

   }
   
   
    
}