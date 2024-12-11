package sessions.numbering.systems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        var userNameOrId = (name.equals("abdallah")? "Abdallah": 1000);
        userNameOrId = 1L;
        System.out.println(userNameOrId);


    }

}
