package mindswap.academy._004_pilares_da_oop.bank;

public class SavingAccount extends Account {
    String name;
    double balance;
    double amount;

    public SavingAccount() {

    }

    public SavingAccount(String name, double balance, double amount) {
        super(name, balance, amount);

        this.name = name;
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double deposit(double amount) {
        return this.balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        return this.balance -= amount;
    }

    /**
     * downcasting
     *
     * @param account
     */
    static void method(Account account) {
        if (account instanceof SavingAccount) {
            SavingAccount savingAccount1 = (SavingAccount) account;
            System.out.println(savingAccount1);
        }
    }
}
