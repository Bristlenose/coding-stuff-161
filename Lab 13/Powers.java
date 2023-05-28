import java.lang.Math;

public class Powers{
   public static void main(String[] args){
      printPowers(3,10);
   }
   
   /** print 12 times table */
   public static String printPowers(int n,int high){
      for(int i = 1; i<= high; i++){
         System.out.print(Math.round(Math.pow(n,i)) +" ");
      }
      return "";

   }
}