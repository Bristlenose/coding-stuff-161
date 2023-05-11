/**student app*/
public class Email{

   private static String spacer = "*";
   
   public static void main(String[] args){
   //set institution address
   Student.institutionEmailAddress = "@student.otago.ac.nz";
   
   //make new student and print email address
   Student s1 = new Student("Andrew","Smith","Botany");
   s1.createUserName();
   s1.toString();
   
   //print 30 *
   System.out.println(spacer.repeat(30));
   
   
   }
}