/** EggMath, William Grounds, 2/3/23*/


public class EggMath{
   public static void main (String[] args){
      int fingers;
      int smallEggs = 8;
      int largeEggs = 13;
      int totalEggs;
      double price;
      double newPrice;
      
      double difference;
      double temperatureAlert;
      double profit;
      double minimumTemp = 10.0;
      double salePrice;
      double cost = 3.4;
      
      price = 8.5;
      
      //Addition
      fingers = 5 + 5;
      totalEggs = smallEggs + largeEggs;
      newPrice = price + 10.50;
      
      //or just raise the price
      price = price + 10.50;
      
      salePrice = newPrice;
      
      //subtraction
      difference = 104 - 34.2;
      temperatureAlert = minimumTemp - 2.5;
      profit = salePrice - cost;
      
      //Multiplication
      fingers = 5 * 2;
      price = price * 1.1; //raise the price by 10%
            
      System.out.println(smallEggs);
      System.out.println(largeEggs);
      System.out.println(price);
   }
}
