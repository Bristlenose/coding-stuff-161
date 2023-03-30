/** Application class for Dog.java */
public class DogApp{
   public static void main(String[]args){ 
      Dog dog1 = new Dog(); // a call to the default constructor
      System.out.println(dog1.getBreed());
      System.out.println(dog1.getRegNo());
      System.out.println(dog1.getAge());
      System.out.println(dog1.isMicroChipped());
      
      dog1.fillFields();
   }
}