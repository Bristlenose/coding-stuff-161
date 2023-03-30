/** Laboratory 5 Worked Example, application class */
public class BookShopApp{
   public static void main(String[] args){
   	//make a new instance of the book class		
      Book book1 = new Book("Potiki", "Patricia Grace", 1986, 27 );
   	//display what the object's toString method returns  
      book1.displayBook(); 
      
      //second book
      Book book2 = new Book("The Luminaries", "Eleanor Catton", 2013, 28.5);
      book2.displayBook();
      
      //book 3
      Book book3 = new Book("Air Born", "J L Pawley", 2010, 22);
      book3.displayBook();
      
      Book book4 = new Book();
      book4.setTitle("hi");
      book4.setAuthor("bye");
      book4.setYear(3000);
      book4.setPrice(3);
      book4.displayBook();
      
      Book book5 = new Book("Kaitangata Twitch", "Margaret Mahy", 2005);
      book5.setPrice(1);
      book5.displayBook();
      
      System.out.println("");
      
      //mutators to change price
      book1.setPrice(30);
      book1.displayBook();
      //mutators to change price
      book2.setPrice(35);
      book2.displayBook();
      
      System.out.println("");
      
      
      System.out.println("Authors:\n" + book1.getAuthor() + "\n" + book2.getAuthor() + "\n" + book3.getAuthor() + "\n");

   }
    
}
