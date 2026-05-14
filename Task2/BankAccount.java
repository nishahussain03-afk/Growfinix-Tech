public class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {

        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}