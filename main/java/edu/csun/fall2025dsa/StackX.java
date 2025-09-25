/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class StackX {
    private char[] data;
    private int top;
    
    public StackX() {
        this(10);
    }
    
    public StackX(int size) {
        data = new char[size];
        top = -1;
    }
    
    public void push(char value) throws StackFullException{
        if (isFull()) {
            throw new StackFullException();
        }
        
        data[++top] = value;
    }
    
    public char pop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty! Nothing to return.");
        } 
        
        return data[top--];
    }
    
    public char peek() {
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
}
