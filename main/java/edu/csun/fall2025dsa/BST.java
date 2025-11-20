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
    
    public void delete(int id) {
        BSTNode delNode = find(id);
        
        if (delNode == null) {      //There is nothing to delete
            return;
        }
        
        if (delNode.isLeafNode()) {     //delNode is a leaf node
            if (delNode == root) {
                root = null;
            } else {
                if (delNode.isLeftChild()) {
                    delNode.getParent().setLeftChild(null);
                } else {
                    delNode.getParent().setRightChild(null);
                }
            }
        } else if (delNode.getLeftChild() == null) {    //Only right child exists
            if (delNode == root) {
                root = delNode.getRightChild();
            } else {
                if (delNode.isLeftChild()) {
                    delNode.getParent().setLeftChild(delNode.getRightChild());
                } else {
                    delNode.getParent().setRightChild(delNode.getRightChild());
                }
            }
            
            delNode.getRightChild().setParent(delNode.getParent());
        } else if (delNode.getRightChild() == null) {   //Only left child exists
            if (delNode == root) {
                root = delNode.getLeftChild();
            } else {
                if (delNode.isLeftChild()) {
                    delNode.getParent().setLeftChild(delNode.getLeftChild());
                } else {
                    delNode.getParent().setRightChild(delNode.getLeftChild());
                }
            }
            
            delNode.getLeftChild().setParent(delNode.getParent());
        } else {        //Both children exist
            BSTNode successor = getSuccesssor(delNode);
            
            delNode.getLeftChild().setParent(successor);
            successor.setLeftChild(delNode.getLeftChild());
            
            if (delNode == root) {
                root = successor;
            } else {
                if (delNode.isLeftChild()) {
                    delNode.getParent().setLeftChild(successor);
                } else {
                    delNode.getParent().setRightChild(successor);
                }
            }
            
            successor.setParent(delNode.getParent()); 
        }        
    }
    
    private BSTNode getSuccesssor(BSTNode delNode) {
        BSTNode successor = delNode.getRightChild();
        
        if (successor.getLeftChild() != null) {
            while (successor.getLeftChild() != null) {
                successor = successor.getLeftChild();
            }
            
            successor.getParent().setLeftChild(successor.getRightChild());
            successor.getRightChild().setParent(successor.getParent());  

            delNode.getRightChild().setParent(successor);
            successor.setRightChild(delNode.getRightChild());
        }
        
        return successor;
    }
    
    public void print() {
        String s = traversePreOrder(root);
        
        if (s == null || s.isEmpty()) {
            System.out.println("Tree is empty!");
        } else {
            System.out.println(s);
        }
        
        System.out.println();
    }
}
