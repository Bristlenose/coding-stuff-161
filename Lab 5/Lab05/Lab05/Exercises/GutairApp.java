/**  Lab 5 Gutair call.java */
public class GutairApp{
   public static void main(String[]args){
   
   //create new gutair object
   Guitar g = new Guitar();
   
   //call number of strings from gutair support class and change it
   g.setNumStrings(6);
   
   //call acoustic from gutair support class and change it
   g.setAcoustic(true);
   
   //call brand from gutair support class and change it
   g.setBrand("Eka");
   
   //print num strings, brand and if acoustic
   System.out.println(g.getNumStrings()+", "+g.getBrand()+", Acoustic = "+g.getAcoustic());
   }
}