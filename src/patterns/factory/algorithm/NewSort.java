package patterns.factory.algorithm;

public class NewSort implements SortAlgorithm{

    @Override
    public void sort(int[] source) {
        System.out.println(this.getClass().getName());
    }
}