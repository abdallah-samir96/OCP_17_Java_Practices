package concurrency.two;

import javax.swing.*;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskThreadDemo {
    private void gui(){
        JFrame frame = new JFrame("Simple Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, Swing!");
        label.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 24));
        frame.add(label);
        frame.setSize(400, 200);
        frame.setVisible(true);
        AtomicInteger startPosition = new AtomicInteger(0);

        new Thread(() -> {
            try {
                while (true) {
                    label.setLocation(startPosition.getAndIncrement(), 0);
                    if(startPosition.get() >= 400) {
                        startPosition.set(-140);
                    }
                    Thread.sleep(10);
                }
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }).start();
    }

    private static void raceCondition(){
        class Info{
            private int data;
        }


        var info = new AtomicInteger(0);

        var executor = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            executor.submit(()->{
                info.incrementAndGet();
            });
        }
        executor.shutdown();
        System.out.println(info.get());

    }
    public static void main(String[] args) {


        Account account = new Account(0);
        new Thread(()->{
            try {
                while(true) {
                    account.deposit(50);
                    Thread.sleep((int)(Math.random() * 1000));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(()->{
            try {
                while(true) {
                    account.withdraw(60);
                    Thread.sleep((int)(Math.random() * 10000));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

    }
}

class Account{
    private int balance;
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        lock.lock();
        try {
            this.balance += amount;
            System.out.println("Add Deposit: " + amount);
            System.out.println("Current Balance: " + balance);
            condition.signalAll();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            lock.unlock();
        }
    }
    public void withdraw(int amount) {
        lock.lock();
        try {
            while(amount > this.balance) {
                System.out.println("\t\t\tBalance: " + balance + ", Amount: "+ amount);
                System.out.println("\t\t\tWaiting for balance");
                condition.await();
            }
            balance -= amount;
            System.out.println("\t\t\tWithdraw Amount: " + amount + ", Current Balance: " + balance);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            lock.unlock();
        }
    }


}