/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class Link {
    private int id;
    private long data;
    private Link next;      //Self referencing
    private Link prev;
    
    public Link(int id, long data) {
        this.id = id;
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "[" + id + ", " + data + "]";
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
     * @return the next
     */
    public Link getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Link next) {
        this.next = next;
    }

    /**
     * @return the prev
     */
    public Link getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Link prev) {
        this.prev = prev;
    }
}
