/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(triangularIterative(5));
        
        int tn = triangularRecursive(5);
        System.out.println(tn);
        
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursion(5));
    }
    
    private static int triangularIterative(int n) {        
        int sum = 0;
        
        /*
        while (n > 0) {
            sum += n;
            n--;
        }
        */
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }

    private static int triangularRecursive(int n) {
        if (n == 1) {       //Base Case
            return 1;
        }
        
        return n + triangularRecursive(n - 1);
    }
    
    private static int factorialIterative(int n) {
        int fac = 1;
       
        while (n > 1) {
            fac *= n;
            n--;
        }
        
        return fac;
    }
    
    private static int factorialRecursion(int n) {
        if (n <= 1) {   //Base Case
            return 1;
        }
        
        return n * factorialRecursion(n - 1);
    }
}
