////////////////////////////////////////////////////////////////////////////////
// class notes for monday, september 7th
// test coming up on friday september 25th
//      time: 11:10-12
// old exams are up on cse2.lehigh.edu

// ORDER OF OPERATIONS IN JAVA

// you must be very specific with the order of operations
// NOTHING CAN BE VAGUE, EVERYTHING INTERPRETED IN ONE WAY

// 2 properties: operator precedence and operator associativity
// every operator has both PRECEDENCE and ASSOCIATIVITY 

// the operator with more PRECEDENCE gets evaluated first
// multiplication and divisions come before additions and subtractions

public class week03 {

    public static void main(String[] args) { 
    
        double value = 1.0/2 + 3*4 - 5.0/6 + 7*8;
        // by saying "5.0" you are casting it as a double value so you are therefore dividing a double by an int and yielding a double
        System.out.println(""+ value);
        value = value*100;
        int value2 = (int) value;
        value = (double) value2;
        value/= 100;
        System.out.println(""+ value);
        
        // java seeks to break every expression into a series of binary operations that it can evaluate into a single number 
        // java evaluated operators with identical precedence from left to right
            // this is called LEFT TO RIGHT ASSOCIATIVITY
            
        //java has more than arithmetic operators
        // "=" is the assignment operator
            // "=" has the lowest precedence of any operator we have seen thus far
            // "=" is not a symetric operator so you cant flip the left and right side
            // the "=" has right to left associative 
        // "(int)" the typecasting operator
            // "(int)" has the highest precedence that we have seen so far
            // when a statement is being evaluated, the typecasted thing is executed first
        
        // type evaluation: 
        double val1 = 3.930482;
        int val2 = 9;
        int val3 = (int) val1 * val2 - (int) val1;
        System.out.println(val3);
        // the val1's are typecasted to ints, then the val1*val2 is multiplied, then val1 is subtracted from the product, 
        // and then the end value is set equal to val3
        
        
        // model of how programs work
            // we operate on FILE INPUTS and STANDARD INPUTS
            // |
            // v
            // software
            // |
            // v
            // STANDARD OUTPUT, FILE OUTPUT
            
        // the scanner class
            // import the class
            import java.util.Scanner; // import
            // declare an instance (object) of the class
            Scanner myScanner; // "Scanner" is like the type, but it is a "class", myScanner is just the name
            // construct the instance
            myScanner = new Scanner (System.in); 
            // ^         ^     ^        ^
            
            // everytime we construct a class, we use the cue "new"
            
            // "java.util.Scanner" is describing what java needs to load in order to run your program
            // using scanner is basically like using code that you have already written 
        
    System.out.println("Monday notes are complete, Wednesday is below"); 

/////////////////////////////////////////////////////////////////////////
// Week 3 lecture 2
// WRAPPING UP CHAPTER 2
// apparently we are supposed to read chapter 1 and 2 
// 
// exam discussion:
//      expect very very tricky questions, definitely good idea to read
//      the book.  
//      must know tiny details because some bugs are very difficult to find
//      CHECK OUT THE PRACTICE EXAMS
//      to practice for the exam, DO THE HWS AGAIN
//      

// moving on.......
// literals:
//      constant value that appears directly in a program
//      ex. 34, 1000000, 5.0, 3.14
//      pretty much any number/"quoted string"
//  

//  types of literals:
//      literals have default types
            // integer literal to int
            // floating pt literal to double
//  a decimal literal is by default a double
//  a float literal ce be denoted with an f or F
//      float myValue 3.4
//      how you end up working with floats if that is what you really want to do 
//          FLOATING POINT NUMBERS DO NOT REMAIN SIMPLE,
//          FLOATING POINT NUMBERS CAN'T GET EVERY NUMBER IN THE REAL NUMBER SYSTEM

//  a double literal can be denoted with a d or D
//  
//  data type: CHAR
//      char represents symbols that can be typed or displayed on a screen
//      char can be a letter or character 
//      a string holds a sequence of chars
//      CHAR IS SURROUNDED WITH SINGLE QUOTES, NOT DOUBLE
//          STRINGS ARE SURROUNDED WITH DOUBLE QUOTES

//  every char is actually stored as a number

//  the word "final" can exist before type specifications 
//  final denotes that a variable can never be changed again at any later point in the program
//  

//  unicode characters can be specified into char variables

//  unicode allows us to specify symbols that dont exist on our keyboard
//  special characters to be award of:
//      backspace:          /b      /u0008
//      tab:                /t      /u0009
//      linefeed: 
//      Carraige Return:
//
//


//chars can be typecast to integers

// know the terms at end of slide show
        

// side note, println only accepts strings, it takes whatever
// is inside its parenthesis and converts it to a string

    }

}

































