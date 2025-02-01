package patterns.factory.algorithm;

public class SelectionSort implements SortAlgorithm{
    @Override
    public void sort(int[] source) {
        System.out.println(this.getClass().getName());
    }
}