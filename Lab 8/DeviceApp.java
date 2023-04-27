/** Device App */

public class DeviceApp{
   private int A,B;
   
   public static void main(String[]args){
   
      //create new device
      Device devA = new Device("NB42",true,2);    
      devA.setPrice(15.99); 
      System.out.println(devA.getModel());
      
      //create 2nd device
      Device devB = new Device("Mark 7",true,3);
      devB.setPrice(10.49);
      System.out.println(devB.getModel());
      
      //print device with more usb ports
      if (maxUSB(devA.getUSB(),devB.getUSB()) == devA.getUSB()){
         System.out.println(devA.getModel()+" has more USB ports");
      }
      
      else if (maxUSB(devA.getUSB(),devB.getUSB()) == devB.getUSB()){
         System.out.println(devB.getModel()+" has more USB ports");
      }
      
   }
   
   //which has more usb ports
   private static int maxUSB(int a,int b){
   if (a > b){
      return a;
   }
   
   else if (b > a){
      return b;
   }
   
   else{
      return a;
   }
   }
   
}
