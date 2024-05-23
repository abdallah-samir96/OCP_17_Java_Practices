import java.util.*;

public class Abdallah {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(null, 19);

        map.merge(null, 6,  (a, b)-> {
            System.out.println("A is : " + a );
            System.out.println("B is : " + b );
            return 5;
        });

        map.compute(null, (a, b) ->{
            System.out.println("A is : " + a );
            System.out.println("B is : " + b );
            return 5;
        });
        System.out.println(map);


        List list  = new ArrayList<>();
        list.add("e1");
        list.add("e3");
        list.add("e2");

        System.out.println(Collections.binarySearch(list, "e3"));
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, "e3"));
        Collections.reverse(list);
        System.out.println(Collections.binarySearch(list, "e3"));
    }
}
