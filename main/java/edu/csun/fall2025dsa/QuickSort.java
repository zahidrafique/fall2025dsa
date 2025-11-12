/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class QuickSort {
    private final static int[] ab = {90, 100, 20, 60, 80, 110, 120, 40, 10, 30, 50, 70};

    public static void main(String[] args) {
        printArray();
        quickSort(0, ab.length-1);        
        printArray();        
    }
    
    private static void quickSort(int left, int right) {
        if (right-left <= 1)        //Base Case for Recursion
            return;
        else {
            int pivotValue = ab[right];
            int part = partitionIt(left, right, pivotValue);
            
            quickSort(left, part - 1);
            quickSort(part + 1, right);
        }
    }
    
    private static int partitionIt(int left, int right, int pivotValue) {
        int leftPtr = left - 1;
        int rightPtr = right;
        
        while (true) {
            while (ab[++leftPtr] < pivotValue); //No operation done in this while loop
            while (ab[--rightPtr] > pivotValue && rightPtr > left); //No operation
            
            if (leftPtr >= rightPtr)
                break;
            else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        
        return leftPtr;
    }

    private static void swap(int leftPtr, int rightPtr) {
        int temp = ab[leftPtr];
        ab[leftPtr] = ab[rightPtr];
        ab[rightPtr] = temp;
    }

    private static void printArray() {
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i] + " ");
        }
        System.out.println();
    }

}
