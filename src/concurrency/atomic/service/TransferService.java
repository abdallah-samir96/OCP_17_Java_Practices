package concurrency.atomic.service;

import concurrency.atomic.account.Account;

public class TransferService {

    // just simulation for lock order to avoid deadlock
    public static void transfer(Account from, Account to, long amount) {

        var firstAccount = from.getId() < to.getId()? from: to;
        var secondAccount = from.getId() < to.getId()? to: from;

        firstAccount.lock.lock();
        secondAccount.lock.lock();

        try{
           boolean isWithdrawn =  from.withdraw(amount);
           if(isWithdrawn) {
               to.deposit(amount);
           }else{
               System.out.println("Account has not enough money to withdraw!!!!");
           }

        }finally {
            System.out.println("Trying to unlock the Lock!!");
            firstAccount.lock.unlock();
            secondAccount.lock.unlock();
        }
    }

}
