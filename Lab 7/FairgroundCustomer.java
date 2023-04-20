/** Chapter 7 Lab Exercise */
import java.util.Scanner;

public class FairgroundCustomer{  
      //datafields   
      private String name;
      private boolean footwear, accompanied;
      private int age;
      private double height;
      
   //constructoe   
   public FairgroundCustomer(String nm, int ag, double ht, boolean acc, boolean fw){
      name = nm;
      age = ag;
      height = ht;
      accompanied = acc;
      footwear = fw;
   }
   //wall of death conditions
   public boolean getWallOfDeath(){
      if (age > 16 && height > 1.6 && footwear){
         return true;
      }
      else{
         return false;
      }
   }
   
   //Fling And Twirl conditions
   public boolean getFlingAndTwirl(){
      if (age > 18 && 1.6 <= height && height <= 2.0 && footwear){
         return true;
      }
      else{
         return false;
      }
   }
   //Log Flume conditions
   public boolean getLogFlume(){
      if (age > 12 && 1.5 <= height && height <= 2.1){
         return true;
      }
      else{
         return false;
      }
   }
   //Giant Drop conditions
   public boolean getGiantDrop(){
      if (accompanied == true){
         return true;
      }
      else if (age > 10){
         return true;
      }
      else{
         return false;
      }
   }
   //wall of death conditions
   public void displayRideOptions(){
      System.out.println(name + " can ride:");
      if (getWallOfDeath() == true){
         System.out.println("Wall of Death");
      }
      if (getFlingAndTwirl() == true){
         System.out.println("Fling and Twirl");
      }
      if (getLogFlume() == true){
         System.out.println("Log Flume");
      }
      if (getGiantDrop() == true){
         System.out.println("Giant Drop");
      }
   }
   

   
}

