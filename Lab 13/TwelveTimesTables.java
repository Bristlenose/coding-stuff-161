public class TwelveTimesTables{
   public static void main(String[] args){
      table();
   }
   
   /** print 12 times table */
   public static String table(){
      for(int i = 1; i< 13; i++){
         System.out.print(1*i +" ");
         System.out.print(2*i +" ");
         System.out.print(3*i +" ");
         System.out.print(4*i +" ");
         System.out.print(5*i +" ");
         System.out.print(6*i +" ");
         System.out.print(7*i +" ");
         System.out.print(8*i +" ");
         System.out.print(9*i +" ");
         System.out.print(10*i +" ");
         System.out.print(11*i +" ");
         System.out.print(12*i +" ");
         System.out.println();
      }
      return "";

   }
}