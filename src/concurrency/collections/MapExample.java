package concurrency.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
    public static void main(String[] args) throws InterruptedException {

        Map<String, String> map = new ConcurrentHashMap<>();


        var t1 = new Thread(()->{
            for(int i = 0; i < 10000; ++i) {
                map.put("a" + i, "A");
            }

        });

        var t2 = new Thread(()->{
            for(int i = 0; i < 10000; ++i) {
                map.put("b" + i, "B");
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println(map.size());

    }
}
