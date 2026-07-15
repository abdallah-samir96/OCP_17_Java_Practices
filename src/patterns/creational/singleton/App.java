package patterns.creational.singleton;

public class App {

    static Runtime r1;
    static Runtime r2;
    public static void main(String[] args) throws InterruptedException {
//
//        var runtime = Runtime.getInstance();
//        var runtime2 = Runtime.getInstance();
//
//        System.out.println(runtime + " " + runtime2);
//        System.out.println(runtime == runtime2);


//        Concurrent code using reflection


        System.out.println("Creating multiple objects through the constructor!!!");
        var t1 = new Thread(()-> {
            var constructor = Runtime.class.getDeclaredConstructors()[0];
            try {
                constructor.setAccessible(true);
                r1 = (Runtime) constructor.newInstance();
            }catch (Exception ex) {
               ex.printStackTrace();
            }

        });

        var t2 = new Thread(()-> {
            var constructor = Runtime.class.getDeclaredConstructors()[0];
            try {
                constructor.setAccessible(true);
                r2 = (Runtime) constructor.newInstance();
            }catch (Exception ex) {
                ex.printStackTrace();
            }

        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r1);
        System.out.println(r2);
    }
}
