/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

import java.util.Comparator;

/**
 *
 * @author zrafique
 */
public class CircleSort {
    public static void selectionSort(Circle[] data) {
        for (int i=0; i < data.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i; j < data.length; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                swap(data, minIndex, i);
            }
        }
    }
    
    public static void selectionSort(Circle[] data, Comparator<Circle> colorComparator) {
        for (int i=0; i < data.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i; j < data.length; j++) {
                if (colorComparator.compare(data[j], data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                swap(data, minIndex, i);
            }
        }
    }
    
    private static boolean swap(Circle[] data, int first, int second) {
        Circle temp = data[first];
        data[first] = data[second];
        data[second] = temp;
        
        return true;
    }
        
        
    static class ColorComparator implements Comparator<Circle> {
        @Override
        public int compare(Circle c1, Circle c2) {
            return c1.getColor().compareTo(c2.getColor());                    
        }
    }
    
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        
        circles[0] = new Circle(20.0, "White");
        circles[1] = new Circle(10.0, "Red");
        circles[2] = new Circle(15.0, "Blue");
        
        //selectionSort(circles);
        
        ColorComparator cc1 = new ColorComparator();
        
        Comparator<Circle> cc2 = (c1, c2) -> {return c2.getColor().compareTo(c1.getColor());};
        
        selectionSort(circles, cc2);
        
        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
