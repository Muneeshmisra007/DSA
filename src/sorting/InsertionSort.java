package sorting;

/*
Insertion sort a virtual hole created and sort data till hole
 */
public class InsertionSort {

    public int[] sort(int[] arr){
        for(int i = 1; i<arr.length; i++){

            int value = arr[i];

            int hole = i;
            while(hole>0 && arr[hole-1]>value){
                    arr[hole] = arr[hole-1];
                    hole--;
            }
            arr[hole] = value;

        }
        return arr;
    }
}
