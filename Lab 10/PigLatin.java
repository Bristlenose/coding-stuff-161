/**PIG LATIN*/
public class PigLatin{
   private static String word;
   public static void main(String[] args){
      //convert word inputted to piglatin via caled method
      word = "dog";
      System.out.println(pigLatin(word));
      
      word = "cat";
      System.out.println(pigLatin(word));
      
      word = "today";
      System.out.println(pigLatin(word));
   }
      
      
      
   /** convert to pig latin*/   
   public static String pigLatin(String n){ 
      //go to lowercase
      String name = n.toLowerCase();
      //save first letter
      String first = name.valueOf(name.charAt(0));
      
      //remove first letter(probbably wrong way but got fustrated)
      String line = "";
      int x = 1;
      while (x < name.length()){
         line += name.charAt(x);
         x+=1;
      }
      
      //(this would be much easier)   
      //name.valueOf(name.charAt(0)) = "";
      
      //append fist letter + ay
      name = line + first + "ay";
      
      return name;
   }
}