package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7, 19, 2, 14, 1};
        
        System.out.println("Original array:");
        print(data);

        MergeSort.sort(data);

        System.out.println("Sorted array:");
        print(data);
    }
    
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] temp, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;

            mergeSort(array, temp, low, middle);
            mergeSort(array, temp, middle + 1, high);
            merge(array, temp, low, middle, high);
        }
    }

    private static void merge(int[] array, int[] temp, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
        }

        int i = low;       // Pointer for the left subarray
        int j = middle + 1; // Pointer for the right subarray
        int k = low;       // Pointer for the merged array

        // Merge elements back into the original array in sorted order
        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray
        while (i <= middle) {
            array[k] = temp[i];
            i++;
            k++;
        }
    }

    private static void print(int[] data) {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
