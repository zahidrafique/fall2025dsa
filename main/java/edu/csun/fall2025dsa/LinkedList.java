package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class LinkedList {
    Link first;
    Link last;
    
    public void insertFirst(int id, long data) {
        Link n = new Link(id, data);
        insertFirst(n);
    }
    
    public void insertFirst(Link n) {
        if (isEmpty()) {
            last = n;
        }
        
        n.setNext(first);
        first.setPrev(n);
        first = n; 
    }
    
    public Link deleteFirst() {       
        if (isEmpty()) {
            return null;
        }
        
        Link temp = first;

        if (first == last) {        //only one link exists
            last = null;
        }
        first.setPrev(null);
        first = first.getNext();

        return temp;
    }
    
    public void insertLast(int id, long data) {
        Link n = new Link(id, data);
        insertLast(n);
    }
    
    public void insertLast(Link l) {
        //Todo: Implement
    }
    
    public Link deleteLast() {
        //Todo: Implement
        return null;
    }
    
    public void insertAfter(int key, int id, long data) {
        Link n = new Link(id, data);
        insertAfter(key, n);
    }
    
    public void insertAfter(int key, Link l) {
        //Todo: Implement
    }    
        
    public Link delete(int id) {
        //Todo: Implement
        return null;
    }
    
    public void reverse() {
        //Todo: Implement
    }
        
    public Link find(int key) {
        if (isEmpty()) {
            return null;
        }
        
        Link current = first;
        do {
            if (current.getId() == key) {
                return current;
            }
            
            current = current.getNext();
        } while(current != null);
        
        return current;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void print() {
        if (isEmpty()){
            System.out.println("LinkedList is empty!!!");
        } else {
            Link current = first;
            while(current != null) {
                System.out.print(current + "=>");
                current = current.getNext();
            }
            System.out.println();
        }
    }
}
