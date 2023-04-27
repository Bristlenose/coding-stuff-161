/** Chapter 7 Lab Exercise */
import java.util.Scanner;

public class FairGroundRides{

   public static void main(String[] args){
      String name;
      boolean footwear, accompanied;
      int age;
      double height;
      
   /* 1 
   Make a new Scanner object and use appropriate prompts
   and methods to get values for footwear, accompanied, 
   age and height.
   
   Use these variables to make an instance of FairgroundCustomer.
   
   Call the displayRideOptions method to print out all the rides this person is allowed to go on.
   
   */
   Scanner sc = new Scanner(System.in);
   System.out.println("What is your name");
   name = sc.nextLine();
   
   System.out.println("What is your age?");
   age = sc.nextInt();
   
   System.out.println("What is your height?(m)");
   height = sc.nextDouble();
   
   System.out.println("Are you accompanied by an adult?(True/False)");
   accompanied = sc.nextBoolean();
   
   System.out.println("Are you wearing footwear?(True/False)");
   footwear = sc.nextBoolean();
   
   FairgroundCustomer c1 = new FairgroundCustomer(name,age,height,accompanied,footwear);
   c1.displayRideOptions();
   

   
   }
}
