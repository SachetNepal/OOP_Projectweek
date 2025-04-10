package week5_6;

class Account {
    private String name;
    private int accNumber;
    private double balance;

    public Account(String name, int accNumber) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public Account(String name, int accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void display() {
        System.out.println("Name: " + name + ", Account Number: " + accNumber + ", Balance: " + balance);
    }
}

