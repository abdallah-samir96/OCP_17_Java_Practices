package concurrency.pargma.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks {
    private static final Lock lock = new ReentrantLock();
    public static int count = 0;

    public  void calculate() {

        for(int i = 0; i < 1000_000; ++i) {
            lock.lock();
            count += 1;
            lock.unlock();
        }
    }
}
