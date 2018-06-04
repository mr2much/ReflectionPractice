public class BankAccount {
    private final String id;
    private int balance = 0;

    public String getId() {
        return id;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public BankAccount(String id) {
        this.id = id;
    }

    public BankAccount(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        if (amount < 0) {
            System.out.println("You cannot deposit a negative amount.");
            return;
        }

        balance += amount;
    }

    public synchronized void withdrawal(int amount) {
        int currentBalance = getBalance();

        if((currentBalance - amount) >= 0) {
            balance -= amount;
        } else {
            System.out.println("You don't have enough funds to withdraw " + amount);
        }
    }
}
