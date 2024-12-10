package java1.course1;

import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        printEvenNumbers(new int []{1, 2, 3, 4, 5, 6, 7});

    }

    private static void printEvenNumbers(int [] nums) {
        Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}