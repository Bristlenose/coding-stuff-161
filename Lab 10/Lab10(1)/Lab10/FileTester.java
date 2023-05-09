import java.io.*; 
import java.nio.file.*; 

/** A class to demonstrate file reading and writing*/
public class FileTester{
   /** The main method, from which execution begins :)
     * @param args Only applicable if running from the command line.
     */
   public static void main(String[] args){ 
      String fileContents = getFileContents("welcome.txt");
      System.out.println(fileContents);
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




