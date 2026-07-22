package interview.collections;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        var list = List.of("A", "BBBB", "CC", "DDDDDDDD");
        var map = list.stream().collect(Collectors.toMap(String::length, name-> name));
        var names = List.of("Ahmed", "Mohamed", "Adel", "Taha");
        String result = names.stream()
                .collect(Collectors.joining(
                        ", ",
                        "[",
                        "]"
                ));
        System.out.println(map);
        System.out.println(result);
    }
}
