package lambda.expression;

public class Main {

    private int x = 100;
    private void dosomething(int y){


        Runnable runnable = ()-> {

            // local variable should be final or effectively final
            System.out.println(x);
            x = 100;
        };

        //x = 200;
        runnable.run();
    }
    public static void main(String[] args) {
        /*
         * Block of code that could have reference to and pass it to another function
         * Final & effectively final in lambda expression
         * */






    }
}
