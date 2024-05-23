import io.problems.CheckSumApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SimpleApplication {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(100, 23, 3, 4, 8, 6, 1000, 1, 300));
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        var reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please Insert An Integral Number : " );
            int searchedValue = Integer.parseInt(reader.readLine());
            boolean isFound = CheckSumApp.searchSum(list, searchedValue);
            if (isFound) {
                System.out.println("Value " + searchedValue + " Is Found");
            } else {
                System.out.println("Value " + searchedValue + " Is Not Found");
            }

        } catch (Exception ex) {
            if (ex instanceof IOException) {
                System.out.println("Exception related to IO, " + ex.getMessage());
            } else if (ex instanceof NumberFormatException) {
                System.out.println("Format is Wrong , " + ex.getMessage());
            }else {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void checkSum(List<Integer> list, int searchedValue) {
        boolean isFound = false;
        int head = 0;
        int tail = list.size() - 1;

        for (int i = 0; i < list.size() - 1; i++) {
            int result = list.get(head) + list.get(tail);
            if (result > searchedValue) {
                tail--;
            } else if (result < searchedValue) {
                head++;
            } else {
                isFound = true;
                System.out.println("Result is : " + result);
                System.out.println("Head Index " + head + ", Value " + list.get(head));
                System.out.println("Tail Index " + tail + ", Value " + list.get(tail));
                break;
            }
        }
        if (!isFound) System.out.println("The Value Not Have Sum !!!!");
    }
}
