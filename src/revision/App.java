package revision;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {


        final var cb = new CyclicBarrier(3,
                () ->
                        System.out.println("Clean!"));

    }
    private static void magic(Stream<Integer> s) {
        Optional<Integer> o = s
                .filter(x ->
                        x < 5)
                .limit(3)
                .max((x, y) ->
                        x-y);
        System.out.println(o.get());
    }
    }

