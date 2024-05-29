package exceptions;

public class App {
    public static void main(String[] args) {
        System.out.println("Handle Checked Exception and throw it again inside the catch block");
        throwException();
    }

    private static void throwException() {

        try{
            int i = Integer.parseInt("1000s");

        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }

    }
}
