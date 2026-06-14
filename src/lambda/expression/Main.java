package lambda.expression;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = ()->{
            run();
        };

        new Thread(runnable).start();



    }
    private static void run(){

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Thread.currentThread().getName());
    }
}
