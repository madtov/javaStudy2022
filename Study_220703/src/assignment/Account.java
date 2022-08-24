package assignment;

public class Account {

    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int balance = 0;

    public void setBalance(int balance) {
        if (MIN_BALANCE <= balance && MAX_BALANCE >= balance) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}