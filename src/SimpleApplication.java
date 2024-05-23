import java.util.*;
public class SimpleApplication {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(100, 23, 3, 4, 8, 6, 1000, 1, 300));
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        int searchedValue = 8;
        checkSum(list, searchedValue);
    }

    private static void checkSum(List<Integer> list, int searchedValue) {
        boolean isFound = false;
        int head = 0;
        int tail = list.size() - 1;

        for (int i = 0; i < list.size() - 1; i++) {
            int result = list.get(head) + list.get(tail);
            if(result > searchedValue){
                tail --;
            }else if(result < searchedValue) {
                head ++;
            }else {
                isFound = true;
                System.out.println("Result is : " + result);
                System.out.println("Head Index " + head + ", Value " + list.get(head));
                System.out.println("Tail Index " + tail + ", Value " + list.get(tail));
                break;
            }
        }
        if(!isFound) System.out.println("The Value Not Have Sum !!!!");
    }
}
