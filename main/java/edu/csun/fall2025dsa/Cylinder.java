/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class Cylinder extends Circle{

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    public Cylinder() {
        super();        //Explicit call to no-parameter parent constructor
        length = 0;       
    }
    
    public Cylinder(double radius, double length, String color) {
        super(radius, color);
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * super.getRadius() * length;
    }
    
    private double length;
    
    
}
