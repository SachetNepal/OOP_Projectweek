package week5_6;

public class Transactions {
    public static void main(String[] args) {
        Account acc1 = new Account("Ram", 12345, 1000.0);
        Account acc2 = new Account("Shyam", 54321); // default zero balance

        acc1.deposit(500.0);
        acc2.deposit(300.0);
        acc1.withdraw(200.0);

        acc1.display();
        acc2.display();
    }
}
