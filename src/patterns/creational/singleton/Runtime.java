package patterns.creational.singleton;

import java.util.HexFormat;

public final class Runtime {
    private static volatile Runtime runtime;

    private Runtime(){
        // here we could not protect this code from reflection,
        // creating the object for the first time through reflection is allowed.
        synchronized (Runtime.class) {
            if (runtime != null) {
                throw new RuntimeException("could not create an runtime through reflection!");
            }
        }

    }

    public static Runtime getInstance() {

        synchronized (Runtime.class){
            if(runtime != null) {
                return runtime;
            }
            runtime = new Runtime();
            return runtime;
        }

    }

    public void printInfo(){
        System.out.println("Printing info related to the class!!!!");
        System.out.println(runtime.getClass().getName());
    }


}
