import java.util.Scanner;
/** default example*/
public class Dog{
   private String breed;
   private int regNo;
   private int age;
   private boolean microChipped;
   
   /**accessor for dog breed*/
   public String getBreed(){
      return breed;
   }
   /**accessor for dog registration number*/
   public int getRegNo(){
      return regNo;
   }
   /**accessor for dog age*/
   public int getAge(){
      return age;
   }
   /**accessor for whether dog is microchipped*/
   public boolean isMicroChipped(){
      return microChipped;
   }
/** method to collect data for data fields*/
   public void fillFields(){
      Scanner scan = new Scanner(System.in);
      System.out.println("What breed is the dog?");
      breed = scan.nextLine();
      System.out.println("Enter dog's registration Number (up to 9 digits)");
      regNo = scan.nextInt();
      System.out.println("Enter dog's age ");
      age = scan.nextInt();
      System.out.println("Is the dog microchipped? true/false");
      microChipped = scan.nextBoolean();
      System.out.println("Entry summary: " + breed + " " + regNo +" "+ age +" " + microChipped);
   }


}