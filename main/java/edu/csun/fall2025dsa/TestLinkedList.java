/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        
        ll.insertFirst(5, 300);
        ll.insertFirst(3, 650);
        ll.insertFirst(7, 230);
        ll.insertFirst(1, 785);
        ll.print();
        
        ll.insertFirst(9, 1000);
        ll.print();
        
        ll.deleteFirst();
        ll.deleteFirst();
        ll.print();
        
        while(!ll.isEmpty()) {
            ll.deleteFirst();
        }
        
        ll.print();
    }
}
