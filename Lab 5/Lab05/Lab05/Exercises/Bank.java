/** Bank acc */

public class Bank{
   //set data fields
   private double balance;
   private String accountName;
   private String CURRENCY = "NZ dollars";
   
   /**default constructor, set all values when creating to null                          */
   public BankAccount(){}
   
   /** constructor, set all values when creating the object                        */
   public BankAccount(double bal, String accName){
      balance = bal;
      accountName = accName;
   }
   
   /** mutator set balance                           */
   public void updateBalance(double bal){
      balance = bal;
   }

   /** accessor returns balance                        */
   public boolean getBalance(){
      return balance;
   }
      
   public void displayBankAccount(){
      System.Out.println("Account holder: "+accountName);
      System.Out.println("Balance in NZ dollars: "+balance);
      
      
   }
}