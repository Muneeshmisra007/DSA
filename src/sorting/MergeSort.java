package sorting;

/**
 * Divide and conquer based approach
 */
public class MergeSort {

    public int[] sort(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeArray(int[] arr, int left, int mid, int right) {
        System.out.println("### left :" + left + ", right : " + right + ", mid :" + mid + ", merging....");
        int[] lArr = new int[mid - left + 1]; //left array
        int[] rArr = new int[right - mid]; //right array

        //filled left and right arr
        int i = 0, j = 0;
        while (i < lArr.length) {
            lArr[i] = arr[left + i];
            i++;
        }
        while (j < rArr.length) {
            rArr[j] = arr[mid + j + 1];
            j++;
        }

        //sorting and merging of left right array into main aray
        i = 0;
        j = 0;
        int k = left;
        while (i < lArr.length && j < rArr.length) {

            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        //remaining elements of  arrays left or right, put in main array

        while (i < lArr.length) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < rArr.length) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }

    private void mergeSort(int[] arr, int left, int right) {
        System.out.println("left :" + left + " right : " + right + " mid " + (left + right) / 2 + " return " + !(left < right));
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            mergeArray(arr, left, mid, right);
        }
    }
}
