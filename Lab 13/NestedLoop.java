public class NestedLoop{
   public static void main(String[] args){
      int print = 0;
      
      //loop prints out stars
      for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){
            if (j <= print){
               System.out.print("*");
            }
         }
         System.out.println();
         //checks which repeat and adjusts number of stars needed
         if (i >= 0){
            print = 1;
         }
         if (i >= 1){
            print = 2;
         }
      }
   }

}