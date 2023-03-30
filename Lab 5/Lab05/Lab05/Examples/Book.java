/** Laboratory 5 Worked Example, support class */
public class Book{
   private String title;
   private String author;
   private int year;
   private double price;
 
   /** constructor for a book object*/
   public Book(String titleIn, String authorIn,  int yearIn, double priceIn){
      title = titleIn;
      author = authorIn;
      year = yearIn;
      price = priceIn; 
   }
  
  /**mutator method for title*/
   public void setTitle(String titleIn){
      title = titleIn;
   }
   /**mutator method for author */
   public void setAuthor(String authorIn){
      author = authorIn;
   }
   /** mutator method for year */
   public void setYear(int yearIn){
      year = yearIn;
   }
  /** mutator method for price */
   public void setPrice(double priceIn){
      price = priceIn;
   }
    /** accessor method, returns title */
   public String getTitle(){
      return title;
   }
    /**accessor method, returns author */
   public String getAuthor(){
      return author;
   }
    /** accessor method, returns year */
   public int getYear(){
      return year;
   }
       /** accessor method, returns price */
   public double getPrice(){
      return price;
   }
   /** method to return a summary description of the book*/
   public void displayBook(){
      System.out.println( title + " by " + author + ". Published " + year + ". $" + price );
   }
   
 

}


