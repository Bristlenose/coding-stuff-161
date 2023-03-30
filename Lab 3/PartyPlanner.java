/** Exercise 2*/
import java.util.Scanner;

public class PartyPlanner{

   //Assigning variables
   private static String ADDRESS = ("133 Main Rd, Faketown");
   private static String VENUE = ("Sunny Spot Events Venue");
   private static String occasion;
   private static String time;
   private static String date;
   
   //main method
   public static void main(String[]args){
      //Set scanner
      Scanner scan = new Scanner(System.in);
      
      //Set occasion
      System.out.println("Enter the occassion: ");
      occasion = scan.nextLine();
      
      //Set date
      System.out.println("Enter the date: ");
      date = scan.nextLine();
      
      //Set time
      System.out.println("Enter the time: ");
      time = scan.nextLine();

   
      //call invitation method
      issueInvitation(occasion, time, date);
   }
     
   public static void issueInvitation(String who,String time,String date){
      //Print output
      System.out.println("You are cordially invited to "+who+".");
      System.out.println("This event will be held at "+ VENUE +" on the "+date +" at "+ time+".");
      System.out.println("The address is "+ ADDRESS);
  }
}