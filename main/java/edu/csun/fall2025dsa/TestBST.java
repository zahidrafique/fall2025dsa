/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class TestBST {
    public static void main(String[] args) {
        BST bst = new BST();
        
        try {
            bst.insert(48, 1234);
            bst.insert(36, 6754);
            bst.insert(42, 87654);
            bst.insert(78, 87654);
            
            int searchId = 780;
            BSTNode found = bst.min();
            
            if (found == null) {
                System.out.println("No node exists with id: " + searchId);
            } else {
                System.out.println("Found node: " + found);
            }
        
        } catch (Exception e) {
            
        }
    }
}
