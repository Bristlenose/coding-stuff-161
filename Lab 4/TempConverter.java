/** Exercise 4*/

import java.util.Scanner;

public class TempConverter{
   public static void main(String[]args){
      
      //return temp fahrenheit
      double fahrenheit = celsiusToFahrenheit( "Please enter the temp in celsius:" );
      System.out.println("The temperature in Fahrenheit is "+fahrenheit);
      
      //return temp celsius
      double celsius = fahrenheitToCelsius( "Please enter the temp in celsius:" );
      System.out.println("The temperature in Fahrenheit is "+celsius);
      
      
   
   } 
   
   //celsius to fahrenheit method
   public static double celsiusToFahrenheit(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      double tempC = sc.nextDouble();
      double tempF =(tempC * 1.8) + 32;
      return tempF;
   }
   
   //fahrenheit to celsius method
   public static double fahrenheitToCelsius(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println( message );
      double fahrenheit = sc.nextDouble();
      double celsius =(fahrenheit - 32)/1.8;
      return celsius;
   }
}
