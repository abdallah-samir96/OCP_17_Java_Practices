package hackerrank;

import java.util.Map;

public class App {
    public static void main(String[] args) {

        var map = Map.of("A", "a", "B", "b");
        map.entrySet().stream().filter((e)-> e.getKey().equals("a")).map(Map.Entry::getValue).sorted().forEach(System.out::println);
    }
}
