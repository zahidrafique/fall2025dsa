/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

import java.util.Arrays;

/**
 *
 * @author zrafique
 */
public class StackInt {
    private int[] data;
    private int top;
    
    public StackInt() {
        this(10);
    }
    
    public StackInt(int size) {
        data = new int[size];
        top = -1;
    }
    
    public void push(int value) throws StackFullException{
        if (isFull()) {
            throw new StackFullException();
        }
        
        data[++top] = value;
    }
    
    public int pop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty! Nothing to return.");
        } 
        
        return data[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty! Nothing to return.");
        } 
        
        return data[top];
    }
    
    public int size() {
        return top + 1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == data.length - 1;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(data);  
    }
}

class StackFullException extends Exception {
    public StackFullException() {
        super("Stack is full! No more can be pushed on Stack.");
    }
    
    @Override
    public String getMessage() {
        return "Stack is full! No more can be pushed on Stack.";
    }
}
