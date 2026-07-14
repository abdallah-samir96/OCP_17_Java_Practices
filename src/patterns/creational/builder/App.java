package patterns.creational.builder;

public class App {
    public static void main(String[] args) {

        var userDetails = new UserDetails.Builder()
                        .name("Ahmed")
                        .password("passcode")
                        .email("abdallah@gmail.com")
                        .build();

        System.out.println(userDetails);
    }
}
