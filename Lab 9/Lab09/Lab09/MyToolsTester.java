/**my tools app*/
public class MyToolsTester{
   public static void main(String[] args){
   //makes new tool
      MyTools tool1 = new MyTools();
      
      //tools default prompt
      tool1.readInt();
      tool1.readDouble();
      tool1.readToken();
      tool1.readLine();
      
      System.out.println();
      
      //tools custom prompt 
      int usrInputint = MyTools.readInt("Please enter your Age");
      double usrInputdouble = MyTools.readDouble("Please enter a Double"); 
      String usrInputtoken = MyTools.readLine("Please enter a Token"); 
      String usrInputstring = MyTools.readLine("Please enter a String");     
   }
}