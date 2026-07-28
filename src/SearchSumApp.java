import io.problems.CheckSumApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SearchSumApp {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(100, 23, 3, 4, 8, 6, 1000, 1, 300));
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        try(var reader = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Please  Insert An Integral Number to search about SUM!!: " );
            int searchedValue = Integer.parseInt(reader.readLine());
            var matchedIndexes = CheckSumApp.searchSum(list, searchedValue);
            if (!matchedIndexes.isEmpty()) {
                System.out.printf("Value %d is found in index (%d, %d)", searchedValue, matchedIndexes.getFirst(), matchedIndexes.getLast());
            } else {
                System.out.printf("Value %d is not Found!!!!", searchedValue);
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
}
