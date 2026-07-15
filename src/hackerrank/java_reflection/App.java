package hackerrank.java_reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /**
         * JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime
         *
         * */
        Arrays
                .stream(App.class.getDeclaredMethods())
                .map(Method::getName)
                .sorted().
                forEach(System.out::println);


    }

    public void printData(){}
    private void hello(){

    }
}
