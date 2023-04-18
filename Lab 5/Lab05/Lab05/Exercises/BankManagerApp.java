/** Bank manager */

public class BankManagerApp{
   public static void main(String[]args){
   
      //create new bank accounts
      BankAccount bankA = new BankAccount(123432.03,"Monty Moneybags");
      BankAccount bankB = new BankAccount(-0.99,"Peregrine Pawpaw");
      
      //Bank A inital value
      bankA.displayBankAccount();
      
      //changes to bank A value
      bankA.updateBalance(11111);
      bankA.updateBalance(-1111);
      bankA.updateBalance(0.42);
      
      //Bank A final value
      bankA.displayBankAccount();
      
      //bank B inital value
      bankB.displayBankAccount();
      
      //changes to bank B value
      bankB.updateBalance(-100);
      bankB.updateBalance(101);
      
      //Bank A final value
      bankB.displayBankAccount();
   }
   
}
