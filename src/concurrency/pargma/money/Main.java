package concurrency.pargma.money;

import java.util.Currency;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Money> moneyList = List.of(
                new Money("Account1", 1000, Currency.getInstance("USD")),
                new Money("Account2", 1500, Currency.getInstance("USD")),
                new Money("Account3", 1400, Currency.getInstance("SAR")),
                new Money("Account4", 2000, Currency.getInstance("EGP"))
        );


        var result = moneyList.stream().map(Money::currency).collect(()-> new HashMap<String, Long>(), (map, c) -> {
            map.merge(c.getCurrencyCode(), 1L, Long::sum);
        }, (map, c)-> System.out.println("From combiner"));


       result.forEach((k, v)-> System.out.println(k + ": " + v));

    }
}

