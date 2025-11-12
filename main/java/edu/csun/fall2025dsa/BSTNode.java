/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class BSTNode {
    private int id;
    private long data;
    private BSTNode parent = null;
    private BSTNode leftChild = null;
    private BSTNode rightChild = null;

    public BSTNode() {
        this.id = 0;
        this.data = 0;
    }
    
    public BSTNode(int id, long data) {
        this.id = id;
        this.data = data;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public long getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(long data) {
        this.data = data;
    }

    /**
     * @return the leftChild
     */
    public BSTNode getLeftChild() {
        return leftChild;
    }

    /**
     * @param leftChild the leftChild to set
     */
    public void setLeftChild(BSTNode leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * @return the rightChild
     */
    public BSTNode getRightChild() {
        return rightChild;
    }

    /**
     * @param rightChild the rightChild to set
     */
    public void setRightChild(BSTNode rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * @return the parent
     */
    public BSTNode getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(BSTNode parent) {
        this.parent = parent;
    }
    
    public boolean isRoot() {
        return parent == null;
    }
    
    public boolean isLeafNode() {
        return leftChild == null && rightChild == null;
    }
    
    public boolean isLeftChild() {
        return parent != null && parent.getLeftChild() == this;
    }
    
    public boolean isRightChild() {
        return parent != null && parent.getRightChild() == this;
    }
    
    @Override
    public String toString() {
        return "(" + id + ", " + data + ")";
    }
}
