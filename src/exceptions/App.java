package exceptions;

public class App {
    public static void main(String[] args) {
        System.out.println("Handle Checked Exception and throw it again inside the catch block");
        System.out.println(getData("A0"));
    }

    private static void throwException() {

        try{
            int i = Integer.parseInt("1000s");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static Integer getData (String value){
        Integer c =  null;
        try{
            c = Integer.parseInt(value);
        }catch(Exception ex) {
            System.out.println("From Catch Method");
        }

        return c;
    }
}
