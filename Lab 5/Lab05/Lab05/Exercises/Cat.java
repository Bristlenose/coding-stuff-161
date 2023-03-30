/** cat */

public class Cat{
   //set data fields
   private String name;
   private String breed;
   private double age;
   private char sex;
   private boolean neutered;
   
   /**default constructor, set all values when creating to null                          */
   public Cat(){}
   
   /** constructor, set all values when creating the object                        */
   public Cat(String na, String br, double ag, char se, boolean ne){
      name = na;
      breed = br;
      age = ag;
      sex = se;
      neutered = ne;
   }
   
   /** mutator set name                           */
   public void setName(String na){
      name = na;
   }
   
   /** mutator set breed                           */
   public void setBreed(String br){
      breed = br;
   }
   
   /** mutator set age                           */
   public void setAge(double ag){
      age = ag;
   }
   
   /** mutator set sex                           */
   public void setSex(char se){
      sex = se;
   }
   
   /** mutator set neutered                           */
   public void setNeutered(boolean ne){
      neutered = ne;
   }
   
   /** accessor returns name                        */
   public String getName(){
      return name;
   }
   
   /** accessor returns breed                        */
   public String getBreed(){
      return breed;
   }

   /** accessor returns age                        */
   public double getAge(){
      return age;
   }

   /** accessor returns sex                        */
   public char getSex(){
      return sex;
   }

   /** accessor returns neutered                        */
   public boolean getNeutered(){
      return neutered;
   }



}