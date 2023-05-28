import java.util.Scanner;

public class Fibonacci{
   public static void main(String[] args){
      System.out.println(fibonacci(377));
   }
   
   /** print fibonacci */
   public static String fibonacci(int x){
      //variables two numbers and resulant
      int n1 = 1;
      int n2 = 1;
      int n3 = 0;
      
      //string to append numbers to
      String fib = (n1 + " "+ n2);
      
      while ((n1+n2) < x){
         n3 = n1 + n2;
         n1 = n2;
         n2 = n3;
         fib += (" "+ n3);
      }
      return fib;
   }
}