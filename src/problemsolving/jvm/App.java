package problemsolving.jvm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.version());

        // var process = Runtime.getRuntime().exec("calc");
        //        Runtime.getRuntime().gc();
        //        System.gc();

        failSafe();


        var map = new HashMap<String, String>();
        map.put("Ahmed", "Ahmed");
        System.out.println(map.get("Ahmed"));
    }

    /**
     * This method will trow ConcurrentModificationException
     * because the iterator is fail fast when changing the collection when iterating on it
     * lead to data consistency and error detects early
     * */
    static void failFast() {
        List<String> animals = new ArrayList<>(List.of("Dog", "Cat", "Fox", "Lion"));
        animals.forEach((animal)->{
            animals.add("Another Animal " + animal);
        });

    }
    /**
     * This will work on copy and added the data on the original
     * hard in debugging, data inconsistent
     * */
    static void failSafe() {
        List<String> animals = new CopyOnWriteArrayList<>(List.of("Dog", "Cat", "Fox", "Lion"));
        animals.forEach((animal)->{
            animals.add("Another Animal " + animal);
        });
        System.out.println(animals);
    }
}



class Test {
    void display(int a) {
        System.out.println("int: " + a);
    }

    void display(double a) {
        System.out.println("double: " + a);
    }
}