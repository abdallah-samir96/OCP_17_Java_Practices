package io.problems;

import java.util.List;

public class CheckSumApp {

    /**
     * here the method should check if there is 2 values that equals to the searchedValue
     *
     * @apiNote The List is sorted
     * Complexity is O(N)
     */
    public static boolean searchSum(List<Integer> list, int searchedValue) {
        boolean isFound = false;
        int head = 0;
        int tail = list.size() - 1;
        while (head < tail) {
            int result = list.get(head) + list.get(tail);
            if (result > searchedValue) {
                tail--;
            } else if (result < searchedValue) {
                head++;
            } else {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
