/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/* Code adopted from Advanced Data Structures by Robert Lafore */
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author zrafique
 */


/*
*   This program implements linear & binary array search
*/
public class BinarySearch {

    public static void main(String[] args) {
        int searchKey;
        int[] sortedArray = {1, 23, 34, 45, 51, 56, 67, 78, 87, 92};

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a search key: ");
        searchKey = scnr.nextInt();
                
        new BinarySearch().search(sortedArray, searchKey);
    }

    private void search(int[] sortedArray, int searchKey) {
        int index = 0;

        /*
        *   Todo: Call various array search implementations 
        */
        
        //index = binarySearch(sortedArray, searchKey);
        index = binarySearch(sortedArray, searchKey, 0, sortedArray.length - 1);
        
        if (index < 0) {
            System.out.println("Search key " + searchKey + " not found!");
        } else {
            System.out.println("Search key " + searchKey + " found at index " + index);
        }
    }

    //  Todo: Implement binary search using iterative approach
    private int binarySearch(int[] sortedArray, int searchKey) {
        int lowerBound = 0;
        int upperBound = sortedArray.length - 1;
        int midPoint;
        
        while(upperBound > lowerBound) {
            midPoint = (lowerBound + upperBound) / 2;
            
            if (searchKey < sortedArray[midPoint]) {
                upperBound = midPoint - 1;
            } else if (searchKey > sortedArray[midPoint]) {
                lowerBound = midPoint + 1;
            } else {    //Found it
                return midPoint;
            }
        }
        
        return -1;
    }

    //  Todo: Implement binary search using recursion
    private int binarySearch(int[] sortedArray, int searchKey, int lowerBound, int upperBound) {
        if (upperBound < lowerBound) {      //Base Case for recursion
            return -1;
        }
        
        int midPoint = (lowerBound + upperBound) / 2;
        if (searchKey < sortedArray[midPoint]) {
            return binarySearch(sortedArray, searchKey, lowerBound, midPoint - 1);
        } else if (searchKey > sortedArray[midPoint]) {
            return binarySearch(sortedArray, searchKey, midPoint + 1, upperBound);
        } else {    //Found it
            return midPoint;
        }
   }
}
