/** Laboratory 9 Worked Example, support class */
public class Book{
   //data fields
   private String title;
   private String author;
   private double costPrice;

 
   /** constructor for a book object
       @param title - the title of the book
       @param author the author of the book
       @param costPrice the cost price of the book
   */
   public Book(String title, String author, double costPrice){
      this.title = title;
      this.author = author;
      this.costPrice = costPrice;
   }

   /** accessor method for the title data field 
      @return the title of the book
   */
   public String getTitle(){
      return title;
   }
   
   /**accessor method for the author data field
   @return the title of the book*/
   public String getAuthor(){
      return author;
   }

   /** method to return a summary description of the book*/
   public void displayBook(){
      System.out.println(title + " by " + author + ".") ;
   }
}


