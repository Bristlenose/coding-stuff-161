/** Bank acc */
import java.util.Formatter;

public class BankAccount{
   //set data fields
   private double balance;
   private String accountName;
   private final String CURRENCY = "NZ dollars";
   
   /**default constructor, set all values when creating to null                          */
   public BankAccount(){}
   
   /** constructor, set all values when creating the object                        */
   public BankAccount(double bal, String accName){
      balance = bal;
      accountName = accName;
   }
   
   /** mutator set balance                           */
   public void updateBalance(double bal){
      balance = balance + bal;
   }

   /** accessor returns balance                        */
   public double getBalance(){
      return balance;
   }
      
   public void displayBankAccount(){
      Formatter formatter = new Formatter();
      System.out.println("Account holder: "+accountName);
      System.out.println("Balance in NZ dollars: "+ formatter.format("%.2f", balance));
      System.out.println("");
      
      
   }
}