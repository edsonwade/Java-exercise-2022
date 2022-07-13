package mindswap.academy._004_pilares_da_oop.bank;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("Rui", 0.0, 0.0);
        SavingAccount savingAccount = new SavingAccount("Mauro", 0.0, 0.0);
        account.amount = 1000.0;
        account.setBalance(account.deposit(account.getAmount()));
        System.out.println("your balance is :" + account.getBalance());
        account.withdraw(account.getBalance() - 50.0);
        System.out.printf("After withdraw your balance  now is : %.2f", account.getBalance());
        System.out.println("\n");

        /**
         * saving account here
         */
        savingAccount.amount = 1000.00;
        savingAccount.setBalance(savingAccount.deposit(savingAccount.getAmount()));
        System.out.println("your balance is :" + savingAccount.getBalance());
        savingAccount.withdraw(savingAccount.getBalance() - 600.0);
        System.out.println("SavingAccount ,After withdraw your balance  now is :" + savingAccount.getBalance());


        /*upcasting -> conversation of subclass in superclass */

        Account account1 = new SavingAccount("Fabio", 12340.45, 1230.99);
        System.out.println(" upcasting conversation of subclass(SavingAccounts) " + account1);




        /* downcasting -> conversation of superclass in subclass  (instanceOf()*/
        Account account2 = new SavingAccount("Hugo", 10000.45, 34455.99);
        SavingAccount.method(account2);


    }


}
