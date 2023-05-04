/** Laboratory 9 Worked Example, support class */

import java.text.NumberFormat;
import java.awt.Point;

public class Book{
   //data fields
   private String title;
   private String author;
   private double costPrice;
   private static double markUp;
   private static final double GST = 0.15;


 
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
   
   /** Sets the value of the data field markUp to input parameter value
   * @param markUpIn the decimal fraction amount by which books will be
   marked up
   */
   public static void setMarkUp(double markUpIn){
      markUp = markUpIn;
   }
   
   /** calculates and returns the retail price of this book
   * @return the final retail cost of this book
   */
   public double getRetailPrice(){
      return Math.ceil(costPrice * (1 + markUp) * ( 1 + GST));
   }
   
   /** Returns a string representation of the instance
   * @return a string representation of the instance
   */
   public String toString(){
      NumberFormat fmt = NumberFormat.getCurrencyInstance();//formats price
      return "Title: " + title + ", Author: " + ", Retail price: " +
      fmt.format(getRetailPrice()) ;
   }


   /** displays Book information to the console window */
   public void displayBook(){
      System.out.println(title + " by " + author);
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      System.out.println("It costs " + fmt.format(getRetailPrice()));
      System.out.println("**********************************");
   } //end method

}


