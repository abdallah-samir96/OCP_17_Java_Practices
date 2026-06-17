package concurrency.atomic.account;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Not real money representation, the money could be represented in different ways
 * */
public class Account {
    private long balance;
    private int id;
    public Lock lock = new ReentrantLock();

    public Account(int id, long balance) {

        System.out.println("Trying to create an account!!");
        this.id = id;
        this.balance = balance;
    }


    public boolean withdraw(long amount){
        if(this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * deposit only if the amount is > 0
     *
     */
    public void deposit(long amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("The amount is deposited");
        }
    }

    public int getId(){return this.id;}
    public long getBalance(){return balance;}
}
