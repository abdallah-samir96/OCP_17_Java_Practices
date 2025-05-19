package concurrency.pargma.money;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        System.out.println(.1 + .2);  // this will not be .3 it will be .30000000000000004

    }

    public static void money() {

        var num1 = new BigDecimal("80.2");
        var num2 = new BigDecimal("20.1");
        System.out.println(num1.add(num2));
        System.out.println("***********************");
        // 10/3 = 3.part -> here will throw exception as the divide has no reminder part
        //System.out.println(new BigDecimal("10").divide(new BigDecimal("3")));


    }
}
