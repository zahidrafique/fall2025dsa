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

public class Queue {
    //  Todo: Declare the array to store data for queue
    long[] data;
    //  Todo: Declare the variables to maintain the queue
    int front;
    int back;
    int numValidValues;
    
    public Queue() {
        this(10);
    }
    
    //  Todo: Impelment the constructor
    public Queue(int maxSize) {
        data = new long[maxSize];
        front = 0;
        back = -1;
        numValidValues = 0;
    }

    //  Todo: put item at rear of queue
    public void insert(long j) {
        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        
        if (back == data.length - 1) {
            back = -1;
        }
        
        data[++back] = j;
        numValidValues++;
    }

    //  Todo: take item from front of queue
    public long remove() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        
        long temp = data[front];
        
        if (front == data.length - 1) {
            front = 0;
        }
        
        front++;
        numValidValues--;
        return temp;     
    }

    //  Todo: return item from front of queue without removing
    public long peekFront() {
        return data[front];
    }

    //  Todo: Implement
    public boolean isEmpty() {
        return numValidValues == 0;
    }

    //  Todo: Implement
    public boolean isFull() {
        return numValidValues == data.length;
    }

    //  Todo: Implement
    public int size() {
        return numValidValues;
    }
    
    @Override
    public String toString() {
        return "front: " + front + ", back: " + back + ", " + Arrays.toString(data);  
    }
}
