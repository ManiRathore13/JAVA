//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class BankAccount {
    private int accountNumber;
    private double balance;
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;


        }else {
            System.out.println("You can't deposit negative amount");
        }

    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;

        }else{
            System.out.println("You can't withdraw negative amount");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000, 500);
        bankAccount.deposit(500);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(500);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(500);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(500);
        System.out.println(bankAccount.getBalance());
    }
}

