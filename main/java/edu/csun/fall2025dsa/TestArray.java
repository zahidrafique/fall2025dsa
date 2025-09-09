/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

import java.util.Scanner;

/**
 *
 * @author zrafique
 */
public class TestArray {
    public static void main(String[] args) {
        int[] mData = getData(); 
        print(mData);
        
        int searchKey = 10;
        int index = linearSearch(mData, searchKey);
        
        if (index >= 0) {
            System.out.println(searchKey + " found at index " + index);
        } else {
            System.out.println(searchKey + " NOT found");
        } 
    }
    
    private static int linearSearch(int[] data, int searchKey) {
        int i = 0 ;
        
        for( ; i < data.length; i++) {
            if (data[i] == searchKey) {
                return i;
            }
        }
              
        return -1;
    }

    private static int[] getData() {
        Scanner scnr = new Scanner(System.in);
        int[] data = new int[5];
        
        data[0] = 5;
        data[1] = 7;
        data[2] = 12;
        System.out.println("Enter values for array");
        for (int i=3; i < data.length; i++) {
            System.out.print("data[" + i +"]: ");
            data[i] = scnr.nextInt();
        }
        
        return data;
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
