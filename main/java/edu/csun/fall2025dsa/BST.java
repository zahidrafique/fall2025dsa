/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class BST {
    private BSTNode root = null;
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public void insert(int id, long data) throws Exception{
        BSTNode newNode = new BSTNode(id, data);
        
        if (root == null) {
            root = newNode;
            return;
        }
        
        BSTNode current = root;
        
        while(true) {
            if (newNode.getId() < current.getId()) {
                if (current.getLeftChild() == null) {
                    current.setLeftChild(newNode);
                    newNode.setParent(current);
                    break;
                } else {
                    current = current.getLeftChild();
                }
            } else if (newNode.getId() > current.getId()) {
                if (current.getRightChild() == null) {
                    current.setRightChild(newNode);
                    newNode.setParent(current);
                    break;
                } else {
                    current = current.getRightChild();
                }
            } else {
                throw new Exception("Duplicates not allowed!");
            }            
        }
    }
    
    public BSTNode find(int id) {
        BSTNode current = root;
        
        while(current != null) {
            if (id == current.getId()) {
                break;
            } else if (id < current.getId()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        
        return current;
    }
    
    public BSTNode min() {
        if (isEmpty()) {
            return null;
        }
        
        BSTNode minNode = root;
        
        while (minNode.getLeftChild() != null) {
            minNode = minNode.getLeftChild();
        }
              
        return minNode;
    }
    
    private String traversePreOrder(BSTNode root) {
        if (root == null)
            return "";
        
        StringBuilder sb = new StringBuilder();
        sb.append(root.getId());
        
        String pointerRight = "---";
        String pointerLeft = "|--";
        
        traverseNodes(sb, "", pointerLeft, root.getLeftChild(), root.getRightChild() != null);
        traverseNodes(sb, "", pointerRight, root.getRightChild(), false);
        
        return sb.toString();
    }
    
    private void traverseNodes(StringBuilder sb, String padding, String pointer, 
            BSTNode node, boolean hasRightSibling) {
    
        if (node == null)
            return;
        
        sb.append("\n");
        sb.append(padding);
        sb.append(pointer);
        sb.append(node.getId());
        
        StringBuilder pb = new StringBuilder(padding);
        if (hasRightSibling) 
            pb.append("|  ");
        else
            pb.append("   ");
        
        String p = pb.toString();
        String pntr = "|--";
        traverseNodes(sb, p, pntr, node.getLeftChild(), node.getRightChild() != null);
        traverseNodes(sb, p, pntr, node.getRightChild(), false);
    }
    
    public void print() {
        String s = traversePreOrder(root);
        System.out.println(s);
    }
}
