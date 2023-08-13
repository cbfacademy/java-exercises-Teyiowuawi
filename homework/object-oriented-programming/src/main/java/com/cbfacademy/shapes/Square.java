package com.cbfacademy.shapes;

public class Square implements Enclosure {
        private double width;
    
        public Square(double witdh){
            this.width = witdh;
        }
    
        @Override
        public double perimeter() {
            double totalPerimeterSquare = width * 4;
            return totalPerimeterSquare;
        }
    
        @Override
        public double area() {
            double totalAreaSquare = width * width;
            return totalAreaSquare; 
        }
}
