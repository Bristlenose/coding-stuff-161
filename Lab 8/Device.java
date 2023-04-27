/** Lab 8 exercises */
public class Device{
   private String model;
   private boolean wiFi;
   private int usb;
   private double price;
     
   /** constructor */
   public Device(String model, boolean wiFi, int usb){
      this.model = model;
      this.wiFi = wiFi;
      this.usb = usb;
   }
   
   //number usb ports
   public int getUSB(){
      return usb;
   }
   
   //set price
   public void setPrice(double price){
      this.price = price;
   }
   
   //show price
   public double getPrice(){
      return price;   
   }
   
   //name of the device 
   public String getModel(){
      return model;
   }
      
      
      
}
   
