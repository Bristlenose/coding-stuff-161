/** 
*/
public class Guitar{
   private int numStrings;
   private boolean acoustic;
   private String brand;
   
   /**                           */
   public Guitar(){}
   
   /**                           */
   public Guitar(int nS, boolean ac, String br){
      numStrings = nS;
      acoustic = ac;
      brand = br;
   }
   
   /**                           */
   public void setNumStrings(int nS){
      numStrings = nS;
   }
   
   /**                           */
   public int getNumStrings(){
      return numStrings;
   }

}