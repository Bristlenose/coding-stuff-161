/**vowels & consonants*/
public class VowelsAndConsonants{
   public static void main(String[] args){
      System.out.println(letters("Hello"));
      System.out.println(letters("Big"));
      System.out.println(letters("Computer"));   
   }
   
   public static String letters(String word){
      int count = 0;
      //list of vowels 
      String vowelList = "aeiouAEIOU";
      //lists of letters in the word
      String vowels = "";
      String consonants = "";
      
      while (count < word.length()){
         //checks if letter is a vowel
         if (vowelList.indexOf(word.charAt(count)) != -1){ 
            vowels += word.charAt(count);
            count += 1;
         }
         //if consonant
         else{
            consonants += word.charAt(count);
            count += 1;
         }
      }
      return ("Word: "+word+" Vowels: "+vowels.length() + " Consonants: " + consonants.length());
   }
}