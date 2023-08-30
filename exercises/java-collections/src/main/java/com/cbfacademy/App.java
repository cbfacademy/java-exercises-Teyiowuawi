package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        int[] exampleArray1 = { 3, 6, 7, 9, 12, 27, 1, 4};
        float[] exampleArray2 = {4.1f, 4.2f, 4.3f, 4.4f, 4.5f, 4.6f, 4.7f, 4.8f, 4.9f, 5.0f, 5.1f, 5.2f };
        double[] exampleArray3 = {333.0d, 3433.1d, 3233.2d, 3133.3d, 312356.4d};
        boolean[] exampleArray4 = {false, true, false, false, true, false}; 

        System.out.println(exampleArray1[4]);
        System.out.println(exampleArray2[4]);
        System.out.println(exampleArray3[4]);
        System.out.println(exampleArray4[4]);

        /*
        Object[][] matrix = {
            { 3, 6, 7, 9, 12, 27, 1, 4},
            {4.1f, 4.2f, 4.3f, 4.4f, 4.5f, 4.6f, 4.7f, 4.8f, 4.9f, 5.0f, 5.1f, 5.2f },
            {333.0d, 3433.1d, 3233.2d, 3133.3d, 312356.4d},
            {false, true, false, false, true, false}};
        */

        Object[][] matrix = {{exampleArray1, exampleArray2, exampleArray3, exampleArray4}};
        
           System.out.println(matrix[1][2]);

    }
}
