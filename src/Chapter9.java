import records.StudentRecord;

import java.io.IOException;
import java.rmi.AccessException;
import java.util.*;


public class Chapter9 {
    public static void main(String[] args) {


    }

    private static void generics(){
        List<?> list = new ArrayList<String>();
        List<? extends Exception> list1 = new ArrayList<Exception>();
        List<? super IOException> list2 = new ArrayList<Exception>();
        list2.add(new AccessException(""));

    }

    private static void maps(){
        /*
        var map = Map.ofEntries(
                Map.entry("A", 100),
                Map.entry("B", 200),
                Map.entry("C", 300)
        );

        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


         */


        List<StudentRecord> list = new ArrayList<>();
        list.add(new StudentRecord("A", "Z", 1));
        list.add(new StudentRecord("A", "B", 1));
        Comparator<StudentRecord> comparator = Comparator
                .comparing(StudentRecord::name)
                .thenComparing(StudentRecord::g)
                 .reversed();

        System.out.println(list);
        Collections.sort(list, comparator);
        System.out.println(list);




      Set<StudentRecord> set= new TreeSet<>(Comparator.comparing(StudentRecord::email));



    }

    private static void listOf(){
        int [] arr = new int[]{1, 2, 3, 4};

        var list1 = Arrays.asList(arr);
        var list2 = List.of(arr);
        var list3 = List.copyOf(list2);

       arr [0] = 100;
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
    private static void checkCollectionMethods(){
        Collection<String> collection = new ArrayList<>();
        collection.addAll(List.of("A","B", "C", "AB"));
        collection.removeIf((e)-> e.startsWith("A"));
        System.out.println(collection);

    }
    private static void printInfo() {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.dir"));
    }
    public static<T extends Exception> T identity(T t) {
        return t;
    }
}