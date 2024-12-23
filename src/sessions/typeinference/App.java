package sessions.typeinference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class App {



    public static void main(String[] args) {
        /*
         * Can Only Be Used for Local Variables.
         * var is reserved type not reserved keyword.
         * Compiler Inference Based on Assigned Value.
         * Must Be Initialized at Declaration.
         * Does Not Allow null at Declaration.
         * Could not be used as class attributes, method parameters.
         * */

        Map<Character, Integer> existingCharacters = new HashMap<>();
        String word = "AAAB";
        for (int x = 0; x < word.length(); ++x) {
            existingCharacters.merge(word.charAt(x), 1, Integer::sum);
        }
        existingCharacters.forEach((k, v) -> System.out.println(k + " = " + v));
    }
    private static boolean isPossibleChange(String data) {

        for (int i = 0; i < data.length(); ++i) {

            for (int j = i + 1; j < data.length(); ++j) {

                if (data.charAt(i) > data.charAt(j)) {
                    System.out.println(data.charAt(i) + "   " + data.charAt(j));
                    return true;
                }


            }
        }
        return false;
}
}