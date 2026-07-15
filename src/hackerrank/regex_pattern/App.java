package hackerrank.regex_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        Map<String, String> map = new HashMap<>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                map.put(emailID, firstName);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        map.entrySet().stream().filter((entry)-> entry.getKey().endsWith("@gmail.com")).map(Map.Entry::getValue)
                .sorted()
                .forEach(System.out::println);
        bufferedReader.close();
    }
}
