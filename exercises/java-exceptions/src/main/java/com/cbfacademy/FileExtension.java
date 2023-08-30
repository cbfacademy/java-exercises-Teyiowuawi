package com.cbfacademy;

public class FileExtension extends Exception{
    private String fileName;

    public FileExtension(String fileName){
        this.fileName = fileName;
    }

    public String check(String fileName) {
        // returns one or zero depnding on format/extension
        // if extension = .java return 1 
    
        
        return this.fileName;

// return 1 when the file extension is .java
// return 0 when the file extension is not .java
// throw a custom exception (that you'll create) in its own class when the file name is null or an empty string.


    }
    // method checks the file name and throw a exception if it doesnt reach the criteria 
    // null or empty the exception gets thrown!
    // we have to implement the criteria 


    // we would initalise the list and then we would map through them and create then attach a value depeding on whether than value is 
    // mapping an addition value to it dpeending on the file name
}
