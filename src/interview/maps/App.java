package interview.maps;

import java.util.*;

public class App {
    public static void main(String[] args) {

        var user = new User("hello");
        Map<User, String> map = new HashMap<>();
        map.put(user, "Abdallah");

        System.out.println(user.hashCode());
        System.out.println(map.get(user));
        user.email = "Ahmed";
        System.out.println(map.get(user));
        System.out.println(user.hashCode());


    }
}
