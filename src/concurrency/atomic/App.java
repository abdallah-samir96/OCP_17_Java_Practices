package concurrency.atomic;

import concurrency.atomic.account.Account;
import concurrency.atomic.service.TransferService;

public class App {

    // Locks ordering!!!!
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Try to send money from account a to account b");
        var accountA = new Account(1, 5_000);
        var accountB = new Account(1, 4_000);
        var thread1 = new Thread(()->{
            TransferService.transfer(accountA, accountB, 1000);
        });
        // in another context
        var thread2 = new Thread(()->{
            TransferService.transfer(accountB, accountA, 1000);
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.printf("Current Balance for account A: %d, Account B: %d", accountA.getBalance(), accountB.getBalance());
    }
}
