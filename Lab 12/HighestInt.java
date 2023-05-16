import java.io.*; 
import java.nio.file.*; 

/** A class to demonstrate file reading and writing*/
public class HighestInt{
   /** The main method, from which execution begins :)
     * @param args Only applicable if running from the command line.
     */
     
     
     
     
     
     
     
     
   public static void main(String[] args){ 
      String fileContents = getFileContents("numbers.txt");
      
      //variables to keep track of which is largest number
      int largest = 0;
      int count = 0;
      int currentnum = 0;
      
      while (count < fileContents.length()){
         //converts from ascii to int
         currentnum = fileContents.charAt(count) -48;
         //if current number > largest number so far replace it and the move onto next number
         if (largest < currentnum){
            largest = currentnum;
            count += 1;
         }
         //move onto next number
         else{
            count += 1;
         }
      } 
      System.out.println(largest);
   }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /** Attempts to open a specified file and returns the contents 
    * as a single string 
    * Returns an empty string if the file is not found.
    * @param fileName The name of the file to be read.
    * @return The contents of the file as a single string.
    */
   public static String getFileContents(String fileName){
      String fileContents = "";
      try {
         fileContents = Files.readString(Path.of(fileName));
      } catch (IOException e) {
         System.out.println("File not found.");
      }    
      return fileContents;
   }
     
    /** Takes the string to be written in as content and the name of the 
      * file to be written to.
      * If the file already exists its contents will be overwritten by 
      * the new content.
      * If the file does not already exist, it will be created in 
      * the current folder.
      * @param newContent The intended new contents of the file.
      * @param fileName The file being created or overwritten.
    */ 
   public static void writeToFile(String newContent, String fileName){      
      try{
         FileWriter myWriter = new FileWriter(fileName);
         myWriter.write(newContent);
         myWriter.close();
      }catch(Exception e){}
   }
}




