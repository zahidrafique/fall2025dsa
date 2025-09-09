package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class Circle extends Object {

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * No argument constructor
     */
    public Circle() {
        //radius = 0.0;
        //color = "Black";
        
        this(0.0, "Black");
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public void print() {
        System.out.println("Radius: " + radius + ", Color: " + color);
    }
    
    @Override
    public String toString() {
        return "Radius: " + radius + ", Color: " + color;
    }
    
    //This is a test class
    private double radius;
    private String color;
    
}
