package com.cbfacademy.shapes;

public class Circle implements Enclosure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        double totalPerimeter = 2 * Math.PI * radius;
        return totalPerimeter;
    }

    @Override
    public double area() {
        double totalArea = Math.PI * Math.pow(radius, 2);
        return totalArea;
    }
    
    
}
