/** AreasCalculator class for COMP161 Chapter 3
*/

import java.util.Scanner;

public class AreasCalculatorApp{
   public static void main(String[] args){
      //Scanner setup
      Scanner scan = new Scanner(System.in);
      
      //Triangle dimensions
      System.out.println("Enter the base of the triangle");
      double base = scan.nextDouble();
      System.out.println("Enter the height of the triangle");
      double height = scan.nextDouble();
      //call triangle method
      areaOfTriangle(base, height);
      
      //Square dimensions
      System.out.println("Enter the base of the square");
      double b = scan.nextDouble();
      System.out.println("Enter the height of the square");
      double h = scan.nextDouble();
      //call square method
      areaOfSquare(b,h);
      
      //Circle dimensions
      System.out.println("Enter the radius of the circle");
      double radius = scan.nextDouble();
      //call circle method
      areaOfCircle(radius);
   
      //Call Methods
      /**areaOfTriangle(base, height);
      areaOfSquare(b,h);
      areaOfCircle(radius);*/
   }
   
   //Area Triangle
   public static void areaOfTriangle(double base, double height){
      System.out.println("The area of a triangle with a base of " + base + " and a height of " + height + " is " + (0.5 * base * height));
   }
   
   //Area Square
   public static void areaOfSquare(double b, double h){
      System.out.println("The area of a square with a base of " + b + " and a height of " + h + " is " + (b * h));
   }
   
   //Area Circle
   public static void areaOfCircle(double radius){
      System.out.println("The area of a circle with a radius of " + radius + " is " + (3.142 *(radius*radius)));
   }
}