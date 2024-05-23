import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter10 {

    public static void main(String[] args) {

    }

    private static void collect() {
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears
    }
    private static void splitrator() {
        List<Integer> list = List.of(1, 2,3,4,5,6,7);
        Spliterator<Integer> spliterator = list.spliterator();
        var half = spliterator.trySplit();
        half.tryAdvance(System.out::println);
        System.out.println("****");
        half.forEachRemaining(System.out::println);
    }
    private static void streamOperations() {

        var stream = Stream
                .generate(Math::random)
                .limit(10);

        var stream2 = Stream.iterate(1, (x) -> x + 1).limit(100);

        stream2.forEach(System.out::println);


    }

    private static void checkOptional() {

        var optional = Optional.ofNullable("asdf");


    }
}
