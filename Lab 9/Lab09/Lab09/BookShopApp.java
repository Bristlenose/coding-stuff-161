/**lab 9 book */


public class BookShopApp{

   public static void main(String[] args){
      Book.setMarkUp(0.8);
      Book book1 = new Book("The Carpathians", "Janet Frame", 18.0);
      //book1.displayBook();
      Book book2 = new Book("Black Boots and Buttonhooks", "Phyllis Johnston", 16.5);
      //book2.displayBook();
      
      System.out.println(book1.toString());
      System.out.println(book2);
   }
}

