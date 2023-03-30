/** Bank manager */

public class BankManagerApp{
   public static void main(String[]args){
   
      //create new bank accounts
      Bank bankA = new Bank(1000,"Monty Moneybags");
      Bank bankB = new Bank(0,"Peregrine Pawpaw");
   
      bankA.displayBankAccount();
   }
}
