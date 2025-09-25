/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class TestStack {
    public static void main(String[] args) {
        //storeInts();
             
        try {
        checkBrackets();
        } catch (StackFullException e) {
            e.printStackTrace();
        }
    }

    private static void storeInts() {
        StackInt stackInt = new StackInt();
        
        try {
            stackInt.push(22);
            stackInt.push(7);
            stackInt.push(11);
        } catch (StackFullException ex) {
            System.out.println(ex.getMessage());
        }
        
        while (!stackInt.isEmpty()) {
            System.out.println(stackInt.pop());
        }
    }
    
    private static void checkBrackets() throws StackFullException {
        StackX stackX = new StackX(30);
        
        String test = "T {m(S[] a) {}}]";
        
        boolean isGood = true;
        
        for (int i=0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stackX.push(c);
            } else if (c == ')') {
                isGood = match(stackX, c, '(');
            } else if (c == '}') {
                isGood = match(stackX, c, '{');
            } else if (c == ']') {
                isGood = match(stackX, c, '[');
            }                 
        }
        
        if (!stackX.isEmpty()) {
            System.out.println("Closing brackets missing for some opening brakets");
        } else if (isGood) {
            System.out.println("Good! All brackets match!");
        }
    }
    
    private static boolean match(StackX stackX, char c, char cc) {
        if (stackX.isEmpty()) {
             System.out.println("Missing opening bracket for " + c);
             return false;
        } else {
            if (cc != stackX.peek()) {
             System.out.println("Brackets mismatch - for " + c + " we have " + stackX.peek());
             return false;
            }
            
            stackX.pop();
        }
        
        return true;
    }
}
