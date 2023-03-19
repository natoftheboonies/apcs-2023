package unit10;

import java.util.Arrays;

public class Scramble {

    /**
     * Sorts a provided array using bubble sort.
     * Algorithm: loop through the array with two nested loops.
     * - compare pairs of adjacent elements; swap them if necessary.
     * - after each pass of the inner loop, one value has bubbled right.
     * After one pass for each array element, all will be sorted.
     * 
     * @param arr array of integers to sort
     */
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /**
     * Sorts a provided array using insertion sort.
     * Algorithm: from index 1 until the end:
     * - retain arr[index]
     * - shift prior elements right, if less than retained value
     * - insert retained value in the gap.
     * If no elements were lower, then gap is where we started.
     * 
     * @param arr array of integers to sort
     */
    public static void insertionSort(int arr[]) {
        // from position 1 to end, remove item as key
        // and shift earlier items right until place is found
        for (int j = 1; j < arr.length; j++) {
            int temp = arr[j];
            int i = j - 1;
            while ((i >= 0) && (arr[i] > temp)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;
        }
    }

    /**
     * Sorts a provided array using selection sort.
     * Algorithm:
     * 
     * @param arr array of integers to sort
     */
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * TODO how does this function work?
     * 
     * @param arr array of integers to shuffle
     */
    public static void shuffle(int arr[]) {
        // TODO
    }

    public static void main(String args[]) {

        int[] arr1 = { 6, 5, 3, 1, 8, 7, 2, 4 };
        insertionSort(arr1);
        System.out.println("Insertion sorted: " + Arrays.toString(arr1));

        int[] arr2 = { 3, 7, 8, 5, 2, 1, 9, 5, 4 };
        selectionSort(arr2);
        System.out.println("Selection sorted: " + Arrays.toString(arr2));

        shuffle(arr2);
        System.out.println("And shuffled: " + Arrays.toString(arr2));

    }
}