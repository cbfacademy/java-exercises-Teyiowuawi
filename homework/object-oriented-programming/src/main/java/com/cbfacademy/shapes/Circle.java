package com.cbfacademy.shapes;

public class Circle implements Enclosure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        double totalPerimeterCircle = 2 * Math.PI * radius;
        return totalPerimeterCircle;
    }

    @Override
    public double area() {
        double totalAreaCircle = Math.PI * Math.pow(radius, 2);
        return totalAreaCircle; 
    }
    
    
}
