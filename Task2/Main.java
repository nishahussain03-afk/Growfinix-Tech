public class Main {
    public static void main(String[] args) {
        BankAccount user1 =
                new BankAccount("Rahul", 5000);
        user1.deposit(1000);
        user1.withdraw(2000);
        user1.checkBalance();
    }
}