/**  Lab 5 Cat call.java */
public class CatApp{
   public static void main(String[]args){
   
   //create new gutair object
   Cat c1 = new Cat();
   
   //set values
   c1.setName("Tiddles");
   c1.setAge(7.5);
   c1.setBreed("tabby");
   c1.setSex('m');
   c1.setNeutered(false);
   
   //2nd cat
   Cat c2 = new Cat("Lady Puddington","Persian",7.5,'f',true);
   
   //print cat 1 info
   System.out.println(c1.getName()+" is a "+c1.getAge()+" year old "+c1.getBreed()+"("+c1.getSex()+"). Neutered: "+c1.getNeutered()+".");
   
   //print cat 2 info
   System.out.println(c2.getName()+" is a "+c2.getAge()+" year old "+c2.getBreed()+"("+c2.getSex()+"). Neutered: "+c2.getNeutered()+".");
   }
}