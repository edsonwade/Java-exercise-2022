package mindswap.academy._004_pilares_da_oop.bank;

public class Account {
    String name;
    double balance;
    double amount;

    public Account() {
    }

    public Account(String name, double balance, double amount) {
        this.name = name;
        this.balance = balance;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (balance < 10.0) System.out.println("cannot realized this operation.. your money is " + balance);
        return balance -= amount + 0.1;
    }



    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", amount=" + amount +
                '}';
    }
}

