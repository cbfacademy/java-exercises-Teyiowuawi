package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        float operand1 = 12.0f;
        float operand2 = 20.0f;

        ArithmeticExercises exercise1 = new ArithmeticExercises();

        System.out.println(exercise1.AddFloat(operand1, operand2));
        System.out.println(exercise1.SubtractFloat(operand1, operand2));
        System.out.println(exercise1.MultiplyFloat(operand1, operand2));
        System.out.println(exercise1.DivideFloat(operand1, operand2));
    }
}
