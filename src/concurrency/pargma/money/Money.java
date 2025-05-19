package concurrency.pargma.money;

import java.util.Currency;

public record Money(String name, long amount, Currency currency) {
}
