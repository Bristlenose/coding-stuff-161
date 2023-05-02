/** Device App */

public class DeviceApp{
   private int A,B;
   
   public static void main(String[]args){
   
      //create new device
      Device devA = new Device("NB42",true,2);    
      devA.setPrice(15.99); 
      System.out.println(devA.getModel());
      
      //create 2nd device
      Device devB = new Device("Mark 7",true,1);
      devB.setPrice(10.49);
      System.out.println(devB.getModel());
      
      System.out.println((maxUSB(devA,devB)).getModel()+" has the most ports");
      
   }
   
   /**which has more usb ports*/
   private static Device maxUSB(Device da, Device db){
   //if a bigger
   if (da.getUSB() > db.getUSB()){
      return da;
   }
   //if b bigger
   else{
      return db;
   }
   }
   
}
