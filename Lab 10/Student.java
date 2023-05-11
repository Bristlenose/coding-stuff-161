/**username*/
public class Student{
   private String givenName;
   private String familyName;
   private String userName = "";
   private String major;
   static String institutionEmailAddress;
   
   //constructor
   public Student(String name,String famName, String maj){
      givenName = name;
      familyName = famName;
      major = maj;
   }
   
   /** make username */
   public String createUserName(){
      //last name first 3 char
      userName += familyName.valueOf(familyName.charAt(0));
      userName += familyName.valueOf(familyName.charAt(1));
      userName += familyName.valueOf(familyName.charAt(2));
      
      //first name first 2 char
      userName += givenName.valueOf(givenName.charAt(0));
      userName += givenName.valueOf(givenName.charAt(1));
      
      //convert to lower case
      userName = userName.toLowerCase();
      
      //convert to Acsii
      int a = ("A".compareTo(givenName.valueOf(givenName.charAt(0)))  *-1)+65;
      int b = ("A".compareTo(familyName.valueOf(familyName.charAt(0)))  *-1)+65;
      
      //get number
      int c = a * b;
      String num = String.valueOf(c);
      
      //append numbers to username
      userName = userName + num.charAt(num.length()-3)+""+num.charAt(num.length()-2)+""+num.charAt(num.length()-1);
      return userName;
   }
   
   /** set email adress */
   public String getEmailAddress(){ 
      return (userName + institutionEmailAddress);
   }
   
   /** set major */
   public String setMajor(String maj){
      major = maj;
      return major;
   }
   
    /** to string */
    public String toString(){
      System.out.println(givenName +" "+ familyName+", Email: "+getEmailAddress()+", Username: "+userName+", Majoring in "+major);
      return "";
    }
     
}