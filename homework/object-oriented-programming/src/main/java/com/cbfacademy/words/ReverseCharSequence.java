package com.cbfacademy.words;

import java.lang.CharSequence;

public class ReverseCharSequence implements CharSequence{
    private String reverseString;
   
        public ReverseCharSequence(String reverseString){
            this.reverseString = reverseString;

        }

        @Override 
        public String toString(){
            for (int i = reverseString.length() - 1; i <=0; i--){
            }
            return reverseString;
        }

        @Override
        public int length() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'length'");
        }

        @Override
        public char charAt(int index) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'charAt'");
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'subSequence'");
        }
        
        public static void main(String[] args) {
            CharSequence eggs = new ReverseCharSequence("Eggs");
            System.out.println(eggs.toString());
        }
    };

    

//exercise 1 question 1: would have to implement all of the abstract methods above including toString
//exercise 2: would all of these methods have to implemnted to return the reverse of a string?