package week7;

public class SortMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        MergeSort mSort = new MergeSort();

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        mSort.printArray(data);

        mSort.mergeSort(data);

        System.out.println("Sorted Data");
        mSort.printArray(data);
    }
}