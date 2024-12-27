package java8.interfaces;

import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        // Functional Interface -> that contains only single abstract method (SAM).

       List<String> ls = List.of("A", "B","C");
       ls.forEach(System.out::println);

    }

    private static void call(Executable executable) {
        executable.print();
    }
}

