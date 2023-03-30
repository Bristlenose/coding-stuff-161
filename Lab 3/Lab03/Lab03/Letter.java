 /**Letter.java
(your name, MONTH, YEAR)
A class to print a dog adoption letter to a successful applicant.
*/
public class Letter{
   //data field
   private static String phone = "03 4893 111";
   public static void main(String[] args){
      dogOffer("Nick");//calling the dogOffer method (1)
   }
   /**
   * A method that prints out a dog adoption offer
   */
   public static void dogOffer(String appsName){
      System.out.println("Dear " + appsName + ",\nI wish to offer you the opportunity to adopt an unloved dog. Please call us on " + phone+ ".");
      signature(); //calling the signature method  
   }
   /**
   * A method that prints out the signature
   */
   public static void signature(){
      System.out.println("\nYours sincerely\nScooby Doo \nAdoption Manager \nDunedin Dog Rescue\nddr.co.nz\nPh:" + phone); //(4)
   }
}
