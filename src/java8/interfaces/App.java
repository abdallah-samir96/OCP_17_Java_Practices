package java8.interfaces;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        String data = "uac";
        Map<Character, Integer> charOccurrences = new HashMap<>();

        for (int i = 0; i < data.length(); i++) {

            charOccurrences.merge(data.charAt(i), 1, (old, newVal)->{

                return old + newVal;
            });
        }

        charOccurrences.forEach((k,v) ->{
            System.out.println("Key: " + k + ", Value : "+ v);
        });




    }
}

