package patterns;


public class MainApp {
    public static void main(String[] args)  {
        System.out.printf("Number of CPUs: %s %n" , Runtime.getRuntime().availableProcessors());
        System.out.println(System.getenv());

    }
}
