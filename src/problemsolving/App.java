package problemsolving;

import java.util.*;

public class App {
    public static void main(String[] args) {

        System.getProperties().forEach((k,v)->{
            System.out.println(k + "=" + v);
        });

        System.out.println("**********");
        trySomething();
        System.out.println("****======");

        System.out.println("Palindrome " + isPalindrome(new LinkedList<>(List.of('M','A','D','A','m'))));

    }

    private static boolean isPalindrome(LinkedList<Character> list){
        for(int i = 0, j = list.size() - 1 ; i < list.size() / 2; ++i, --j) {
            if(list.get(i) != list.get(j))
                return false;
        }
        return true;

    }

    private static void trySomething(){

        HashMap<String, String> map = new HashMap<>();

        map.put(null, "Hello");

        System.out.println(map);
    }
}
