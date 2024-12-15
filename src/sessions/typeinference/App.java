package sessions.typeinference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class App {



    public static void main(String[] args) {
        /*
         * Can Only Be Used for Local Variables.
         * var is reserved type not reserved keyword.
         * Compiler Inference Based on Assigned Value.
         * Must Be Initialized at Declaration.
         * Does Not Allow null at Declaration.
         * Could not be used as class attributes, method parameters.
         * */



        var c = (System.currentTimeMillis() > 1000)? "Good": 100;
        c = 10.6;





    }

}
