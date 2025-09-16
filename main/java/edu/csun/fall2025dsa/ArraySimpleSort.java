/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class ArraySimpleSort {
    public static void main(String[] args) {
        int[] mData = {25, 34, 12, 76, 4, 11, 9, 45}; 
        
        print(mData);        
        //bubbleSort(mData);
        //selectionSort(mData);
        insertionSort(mData);
        
        print(mData);
    }
    
    public static void insertionSort(int[] data) {
        int temp;
        
        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            
            int j = i;
            
            while(j > 0 && data[j-1] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            
            data[j] = temp;
        }
    }
    
    public static void selectionSort(int[] data) {
        for (int i=0; i < data.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                swap(data, minIndex, i);
            }
        }
    }
    
    public static void bubbleSort(int[] data) {
        boolean swapped = true;
        int i = 0;
        
        while ((i < data.length) && swapped) {
        //for (int i=0; i < data.length - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j+1]) {
                    swapped = swap(data, j, j+1);
                }
            }
            
            //if (!swapped) {
            //    break;
            //}
        }
    }

    private static boolean swap(int[] data, int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
        
        return true;
    }
    
    private static void print(int[] data) {
        System.out.print("[");
        for(int i=0; i < data.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(data[i]);
        }
        System.out.println("]");
    }
}
