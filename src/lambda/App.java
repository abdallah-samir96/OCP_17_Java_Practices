package lambda;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

record UserInfo(String name, String email) {

    UserInfo{
        name = name.toUpperCase();
        email = email.toUpperCase();
        System.out.println("name  = " + name);
        System.out.println("email  = " + email);
    }
}

class User{
    public String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class App {


    // this could be updated inside the lambda expression
    private int data;
    public static void main(String[] args) {
        System.out.println(new UserInfo("Abdallah", "abdallahsameer22@gmail.com"));
        System.out.println("Date now : " +
                new SimpleDateFormat("ddMMyyyy")
                .format(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant())));
        System.out.println("Lambda Final or effectively Final!!!");
        new App().checkLambda();
    }
    private void checkLambda() {
        int anotherData = 0;
        List<User> users = List.of(
                new User("Ahmed"),
                new User("Abdallah"),
                new User("Mohamed")
        );

        // here the instance variable could be updated inside the lambda
        // if the local variable is used inside the lambda expression, here we could not mutate the value of it
        // we could not change the local variable, it should be final or effectively final
        // we could mutate the instance variable or static variable but could not with local variable
        // The lambda expression could not update the local variable of it

        users.stream().forEach((u)-> {
            this.data = (int)(Math.random() * 0);
            System.out.println("The anotherData is : " + anotherData);
            u.name = "ahmed";
        });

        System.out.println(users);
    }

}
