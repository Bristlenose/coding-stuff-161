/**vowels & consonants*/
public class VowelsAndConsonants{
   public static void main(String[] args){
      System.out.println(letters("Hello"));   
   }
   
   public static String letters(String word){
      int count = 0;
      String vowelList = "aeiouAEIOU";
      String vowels = "";
      String consonants = "";
      while (count < word.length()){
         //checks if letter is a vowel
         if (word.charAt(count)){
            System.out.println(word.charAt(count));
            vowels += word.charAt(count);
            count += 1;
         }
         else{
            consonants += word.charAt(count);
            count += 1;
         }
      }
      return (vowels + "" + consonants);
   }
}