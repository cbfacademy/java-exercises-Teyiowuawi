package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

 public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> example1String = new ArrayList<>();
        
        for ( int number : numbers){
            if (number % 5 == 0 && number % 3 == 0) {
                example1String.add("FizzBuzz");}

            else if (number % 5 == 0){
            example1String.add("Buzz");
    }
            else if (number % 3 == 0){
            example1String.add("Fizz");
    }

            else {
            example1String.add(Integer.toString(number));
           }
        }

        return example1String;
    }
    
    
    public String whichMonth(Integer number) {
        switch (number){
        case 1:
        return("January");
        case 2:
        return ("February");
        case 3:
        return("March");
        case 4:
        return("April");
        case 5: 
        return("May");
        case 6: 
        return("June");
        case 7: 
        return ("July");
        case 8:
        return("August");
        case 9:
        return("September");
        case 10:
        return("October");
        case 11:
        return("November");
        case 12: 
        return("December");
        default: 
        return("Invalid month number");
    } 
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        LinkedHashMap<String, Integer> exampleLinkedHashMap = new LinkedHashMap<>();
        List<Integer> exampleList = new LinkedList<>();
        Collections.addAll(exampleList, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
            41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 
            51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 
            71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 
            91, 92, 93, 94, 95 , 96, 97, 98, 99, 100);
        int calculatedSumOfEvens = 0;
        int calculatedSumOfOdds = 0;
        for (int i = 0; i < exampleList.size(); i++){
            if (i % 2 == 0){
                calculatedSumOfEvens += exampleList.get(i);
            }
            else if (i % 2 != 0) {
                calculatedSumOfOdds += exampleList.get(i);
            }
        }
        exampleLinkedHashMap.put("SumOfEvens", calculatedSumOfEvens);  
        exampleLinkedHashMap.put("SumOfOdds", calculatedSumOfOdds);
        return exampleLinkedHashMap;
       }   
    
       public List<Integer> reverse(ArrayList<Integer> numbers) {
        Collections.reverse(numbers);
        return numbers;
        }

    public String getName() {
        return "Flow Control Exercises";
    }

     
}

