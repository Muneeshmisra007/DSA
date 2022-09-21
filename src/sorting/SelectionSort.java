package sorting;

/**
 * Selection sort on the basis of finding of minimum in rest of array, so remaining array sinks
 *
 * Select minimum
 */
public class SelectionSort {

    public int[] sort(int[] arr) {
        for (int start = 0; start < arr.length - 1; start++) {
            int minPos = findMin(start, arr);
            if (minPos >= 0) {
                int temp = arr[start];
                arr[start] = arr[minPos];
                arr[minPos] = temp;
            }
        }
        return arr;
    }

    private int findMin(int start, int[] arr) {
        int temp = arr[start];
        int position = -1;
        for (int i = start+1; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
                position = i;
            }
        }
        return position;
    }
}
