package sorting;

/**
 * Similar to brute force sorting but pushing max element to right most,
 * then iterate to push next greater element to second right most
 * and so on
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {

        for (int start = 0; start < arr.length - 1; start++) {
            for (int beg = 0; beg < arr.length - 1 - start; beg++) {
                if (arr[beg] > arr[beg + 1]) {
                    int temp = arr[beg + 1];
                    arr[beg + 1] = arr[beg];
                    arr[beg] = temp;
                }
            }
        }
        return arr;
    }
}


