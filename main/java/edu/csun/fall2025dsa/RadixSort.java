/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] data = {170, 45, 75, 802, 24, 2, 66, 1000};
        
        System.out.println("Before: " + Arrays.toString(data));
        sort(data);
        System.out.println("After:  " + Arrays.toString(data));
    }
        
    public static void sort(int[] original) {
        if (original == null || original.length < 2) {
            return;
        }

        int max = getMax(original);
        
        int[] output = new int[original.length];
        int[] count = new int[10];

        // Do counting sort for every digit (exp = 1, 10, 100, ...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            Arrays.fill(count, 0);

            countingSort(original, exp, count, output);

            // Copy output back to arr for next digit
            System.arraycopy(output, 0, original, 0, original.length);
        }
    }

    private static void countingSort(int[] arr, int exp, int[] count, int[] output) {
        // Count occurrences of each digit
        for (int value : arr) {
            int digit = (value / exp) % 10;
            count[digit]++;
        }
        
        // Convert count[i] so it contains actual positions
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        // Build output array (traverse backwards for stability)
        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            int digit = (value / exp) % 10;
            output[--count[digit]] = value;
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}
