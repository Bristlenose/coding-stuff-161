/**my tools app*/
public class MyToolsTester{
   public static void main(String[] args){
   //makes new tool
      MyTools tool1 = new MyTools();
      
//       //tools non static calling
//       tool1.readInt();
//       tool1.readDouble();
//       tool1.readToken();
//       tool1.readLine();
//       
//       System.out.println();
//       
//       //tools static calling
//       int usrInputint = MyTools.readInt("Please enter your Age");
//       double usrInputdouble = MyTools.readDouble("Please enter a Double"); 
//       String usrInputtoken = MyTools.readLine("Please enter a Token"); 
//       String usrInputstring = MyTools.readLine("Please enter a String");
      
//       //random number
//       int random = MyTools.randomInRange(3,0);
         
      tool1.readChar();   
   }
}