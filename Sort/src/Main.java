import impl.*;

/**
 * Created by dasom on 2016-10-06.
 */
public class Main {

    public static void main(String[] args){

        int[] arr = {6, 5, 9, 3, 1, 8, 7, 10, 2, 4};
        new SelectionSort(arr);

        int[] arr2 = {6, 5, 9, 3, 1, 8, 7, 10, 2, 4};
        new InsertionSort(arr2);

        int[] arr3 = {6, 5, 9, 3, 1, 8, 7, 10, 2, 4};
        new BubbleSort(arr3);

        int[] arr4 = {6, 5, 9, 3, 1, 8, 7, 10, 2, 4};
        new MergeSort(arr4);

        int[] arr5 = {6, 5, 9, 3, 1, 8, 7, 10, 2, 4};
        new QuickSort(arr5);
    }
}
