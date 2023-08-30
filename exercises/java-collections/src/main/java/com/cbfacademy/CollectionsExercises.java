package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
            LinkedList<Integer> integers = new LinkedList<>();
            //  - add 4 as the first element of the list
            integers.add(4);
            //  - then add 5, 6, 8, 2, 9 to the the list
            integers.add(5);
            integers.add(6);
            integers.add(8);
            integers.add(2);
            integers.add(9);
            //  - add another 2 as the last element of the list
            integers.add(2);
            //  - add 4 as the 3rd element of the list
            integers.add(2, 4);
            //  - invoke the method element() on the list and print the result on the screen
            System.out.print(integers.element());
            //  - return the list
            return integers;
        }
      
    
public Stack<Integer> useStack() {
       Stack<Integer> example2 = new Stack<>();
        //  - add 5, 6, 8, 9 to the the stack
        example2.add(5);
        example2.add(6);
        example2.add(8);
        example2.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(example2.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(example2.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(example2.pop());
        //  - invoke the push(4) method on the stack
        example2.push(4);
        //  - return the stack
        return example2;
        
    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> exampleQueue = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the the stack
        exampleQueue.add(5);
        exampleQueue.add(6);
        exampleQueue.add(8);
        exampleQueue.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(exampleQueue.peekFirst());
        //  - print the last element of the queue on the screen
         System.out.print(exampleQueue.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(exampleQueue.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(exampleQueue.element());
        //  - return the queue
        return exampleQueue;
    }


   public HashMap<Integer, String> useHashMap() {
        HashMap<Integer, String> exampleHashMap = new HashMap<>();
     
        exampleHashMap.put(1, "TypeScript");
        exampleHashMap.put(2, "Kotlin");
        exampleHashMap.put(3, "Python");
        exampleHashMap.put(4, "Java");
        exampleHashMap.put(5, "JavaScript");
        exampleHashMap.put(6, "Rust");
        System.out.print(exampleHashMap.keySet());
        System.out.print(exampleHashMap.values());
        System.out.print(exampleHashMap.containsValue("English"));
       return exampleHashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
