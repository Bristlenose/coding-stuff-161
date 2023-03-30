/** 
*/
public class Guitar{
   private int numStrings;
   private boolean acoustic;
   private String brand;
   
   /**default constructor, set all values when creating to null                          */
   public Guitar(){}
   
   /** constructor, set all values when creating the object                        */
   public Guitar(int nS, boolean ac, String br){
      numStrings = nS;
      acoustic = ac;
      brand = br;
   }
   
   /** mutator set num strings                           */
   public void setNumStrings(int nS){
      numStrings = nS;
   }
   
   /** accessor returns num stings                         */
   public int getNumStrings(){
      return numStrings;
   }
   
   /** mutator set acoustic or not                          */
   public void setAcoustic(boolean ac){
      acoustic = ac;
   }
   
   /** accessor returns if acoustic                           */
   public boolean getAcoustic(){
      return acoustic;
   }
   
   /**  mutator set brand                        */
   public void setBrand(String br){
      brand = br;
   }
   
   /**  accessor returns brand                         */
   public String getBrand(){
      return brand;
   }

}