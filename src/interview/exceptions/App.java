package interview.exceptions;

import java.util.List;

public class App {
    public static void main(String[] args) {
        flatMap();
    }
    private static void flatMap() {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        List<Integer> result = numbers.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(result);
    }

    private static int printAndGet() {
        try{
            int c = 100;
            System.out.println(c);
            return c;
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Finally");
        }
        return 0;
    }
}