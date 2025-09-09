package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.print();
        
        Circle c2 = new Circle(3.5, "White");
        System.out.println(c2.toString());
        System.out.println("" + c2.hashCode());
        System.out.println("Area: " + c2.getArea());
        
        System.out.printf("%s, Area: %.3f\n", c2.toString(), c2.getArea());

        Cylinder cl1 = new Cylinder(3.5, 10, "Blue");
        System.out.println("Cylinder Area: " + cl1.getArea());
        
        Circle cx = cl1;
        System.out.println("CX Area: " + cx.getArea());
        
    }
}
