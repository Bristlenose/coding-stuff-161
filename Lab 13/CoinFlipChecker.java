import java.util.Random;
import java.util.Scanner;
/** A class to determine how many runs of simulated coin flips are
required before exactly half the flips are 'heads' and half are
'tails'
*/

public class CoinFlipChecker{

   public static void main(String[]args){
      int numRuns = 0;
      int limit = 100000;//this number must be even and positive!
      boolean exactlyHalf;
      
      limit = readPosEvenInt();
      
      do{
         exactlyHalf = isEvenRun(limit);
         numRuns++;
      }while(!exactlyHalf);//keeps going until we have a run that is half and half
      
         System.out.println("Number of coin flips in each run: " + limit);
         System.out.println("It took " + numRuns +" attempts to get exactly half heads and half tails.");
      }
      
      /** Takes an int and simulates a run of that many 'coin flips'
      using Random's nextBoolean method. Returns true if exactly
      half the flips are 'heads' and half are 'tails', false otherwise.
      @param limit the number of simulated coin flips per 'run'
      @return true if the number of heads and tails is equal, false
      otherwise
      */
      
      public static int readPosEvenInt(){
         int limit;
         Scanner sc = new Scanner(System.in);
         String prompt = "Please enter the number coin flips per run." +"\nThis must be a positive even number!";
         do{
            System.out.println(prompt);
            limit = sc.nextInt();
         }while(limit % 2 != 0 || limit < 2);//keeps asking while limit is either odd or less than 2
         return limit;
      }
      
      public static boolean isEvenRun(int limit){
         Random r = new Random();
         int numHeads = 0;
         int numTails = 0;
         for(int i = 0; i< limit; i++){
            if(r.nextBoolean())numHeads++;
            else numTails++;
         }
         return numHeads == numTails;//
      }
      
      
}