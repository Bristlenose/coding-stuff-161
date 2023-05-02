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
      tool1.readInt("Give an Interger");
      tool1.readDouble("I require a Double");
      tool1.readToken("Show me a Token");
      tool1.readLine("Feed me a Line");
      
   }
}