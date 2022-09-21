package sorting;

public class QuickSort {

    public int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start > end || start < 0) {
            return;
        }
        //get pivot and change to its position by following rule
        // element less than pivot will go left side and greater than ones will go right side
        int partitionIndex = getPartitionIndex(arr, start, end);

        //now divide array without creating new ones, from, partition index
        quickSort(arr, start, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, end);

    }

    private int getPartitionIndex(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }

        int temp1 = arr[end] ;
        arr[end] = arr[pIndex];
        arr[pIndex] = temp1;

        return pIndex;
    }
}
