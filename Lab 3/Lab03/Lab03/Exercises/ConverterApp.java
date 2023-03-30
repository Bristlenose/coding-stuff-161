/** ConverterApp class for COMP161 Chapter 3
*/

import java.util.Scanner;

public class ConverterApp{
   public static void main(String[] args){
      //Scanner setup
      Scanner scan = new Scanner(System.in);
      
         //set pounds
         System.out.println("Enter the weight in pounds for conversion to kg: ");
         double pounds = scan.nextDouble();

         //set kg
         System.out.println("Enter the weight in kg for conversion to pounds: ");
         double kg = scan.nextDouble();

         //set miles
         System.out.println("Enter the distance in miles for conversion to km: ");
         double miles = scan.nextDouble();

         //set km
         System.out.println("Enter the distance in km for conversion to miles: ");
         double km = scan.nextDouble();

         //set g
         System.out.println("Enter the weight in g for conversion to kg: ");
         double g = scan.nextDouble();
      
      //call methods
      poundsToKilos(pounds);
      kilosToPounds(kg);
      milesToKm(miles);
      kmToMiles(km);
      gramsToKilos(g);
   }
   
   /**method to convert from pounds to kilos and display the information */
   public static void poundsToKilos(double pounds){
      System.out.println(pounds + " pounds is equal to " + (pounds * 0.453592) + " kg.");
   }
   
   /**method to convert from kilos to pounds and display the information */
   public static void kilosToPounds(double kilos){
      System.out.println(kilos + " kg is equal to " + (kilos / 0.453592) + " pounds.");
   }
   
   /**method to convert from miles to km and display the information */
   public static void milesToKm(double miles){
      System.out.println(miles + " miles is equal to " + (miles * 1.60934) + " km.");
   }
   
   /**method to convert from km to miles and display the information */
   public static void kmToMiles(double km){
      System.out.println(km + " km is equal to " + (km / 1.60934) + " miles.");
   }
   
   /**method to convert from kilos to grams and display the information */
   public static void gramsToKilos(double grams){
      System.out.println(grams + " g is equal to " + (grams / 1000) + " kg.");
   }
}