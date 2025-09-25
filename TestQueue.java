/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        
        queue.insert(5);
        queue.insert(3);
        queue.insert(6);
        long v = queue.remove();
        queue.insert(4);
        queue.insert(7);
        queue.insert(1);
        
        System.out.println(queue);
    }
}
