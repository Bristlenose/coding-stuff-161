

import java.util.Scanner;

public class UserName{
   public static void main(String[] args){
      getUserName();
   }
   
   /** take input and check if username is vaild*/
   public static String getUserName(){
      Scanner in = new Scanner(System.in);
      boolean user = false;
      while (user != true){
         //take input
         System.out.println("Please enter your otago username: ");
         String name = in.nextLine();
         
         if (name.length() == 8){
         
            //substring splitup
            String charCheck = name.substring(0,5);
            String digitCheck = name.substring(4,8);
         
            //if 4 char & 4 num
            if (testChar(charCheck) == 4 && testDigit(digitCheck) == 4){
               System.out.println(charCheck.charAt(0) +""+charCheck.charAt(1) + charCheck.charAt(2) + charCheck.charAt(3) + digitCheck);
               user = true;
            }
            //if 5 char & 3 num
            else if (testChar(charCheck) == 5 && testDigit(digitCheck) == 3){
               System.out.println(charCheck + digitCheck.charAt(1)+ digitCheck.charAt(2)+ digitCheck.charAt(3));
               user = true;
            }
            
         }
       }
      return "";  
   }
   
   
   
   
   
   
   
   
   /** check how many characters */
   public static int testChar(String in){
      //if first 4 characters are letters and 5th a number 
      if (Character.isLetter(in.charAt(0)) == true && Character.isLetter(in.charAt(1)) == true && Character.isLetter(in.charAt(2)) == true && Character.isLetter(in.charAt(3)) == true && Character.isLetter(in.charAt(4)) == false){
         return 4;
      }
      
      //if all characters are letters
      else if (Character.isLetter(in.charAt(0)) == true && Character.isLetter(in.charAt(1)) == true && Character.isLetter(in.charAt(2)) == true && Character.isLetter(in.charAt(3)) == true && Character.isLetter(in.charAt(4)) == true){
         return 5;
      }
      else{
         return 0;
      }
   }
   
   /** check how many digits */
   public static int testDigit(String in){
      //if last 4 characters are digit 
      if (Character.isDigit(in.charAt(0)) == true && Character.isDigit(in.charAt(1)) == true && Character.isDigit(in.charAt(2)) == true && Character.isDigit(in.charAt(3)) == true){
         return 4;
      }
      
      //if last 3 characters are digits
      else if (Character.isDigit(in.charAt(1)) == true && Character.isDigit(in.charAt(2)) == true && Character.isDigit(in.charAt(3)) == true){
         return 3;
      }
      else{
         return 0;
      }
   }
}