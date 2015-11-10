/////////////////////////////////////////////////////////////////////////////////
// into CHAPTER 3
// talking about selections (also called if statements)

// so far we have only executed straight line code
//  

// to begin discussion, we must under stand the "boolean" type
//      boolean only stores TRUE and FALSE as values
//          a class of operators can also create booleans like ints and doubles create doubles
                // called COMPARISON OPERATOR
                
// six primary comparison operators
//      <=      less than or equal to
//      >=      more than or equal to
//      <       less than
//      >       more than
//      ==      is equal to 
//      !=      is NOT equal to 

// comparison operators have lower precedence than +,-,/,*
// comparison operators have higher precedence than assignment 
// comparison operators have left to right associativity 

// whatever assignment is given the boolean type is given the value of either true or false

// how to check if two Strings are equal:
//      String first = new String ("a");
//      String second = new String ("a");
//      NOT System.out.println(first == second); NOT
//      System.out.println(first.equals(second));
//          by calling the "equals()" method, we get a boolean that reflects the equlity of two strings

import java.util.Scanner;

public class week04 { 
    public static void main(String[] args) { 
        
        Scanner myScanner = new Scanner (System.in);
        System.out.print("input first string variable: ");
        String first = myScanner.nextString();  // WHAT IS GOING ON IN THIS LINE
        String second = new String ("a");
        System.out.println(first.equals(second));
        // only use the ".equals()" for Strings
       
// logical and operators:
//      &,     &&
        // the reason for a single and double & is because of lazy operator
        // boolean truth = A && B;
        //      evaluates to true if both A and B are true - if they werent both true then you would get 
        //      "false" printed without even having to evaluate B
        // && allows you to skip the evaluation of B (lazy) if A is false
        // & forces you to evaluate B for truth, even if A is false
    // for the most part, you will only be using the double && or double ||
// logical or operators:
//      |,     ||
// logical not operator:
//      !
//  these operators allow you to relate booleans 
       
// logical operators have precedence below equality operators, above assignment operators

// booleans control selection statements
// ex of selection statement:

//if ( boolean condition ) {
    // make sure to put a space between parenthesese and if statement and indent statements
    
  //  <statement>;
    
//}

//else {
    
//    <statement>;
    
//}

/////////////////////////////////////////////////////////////////////////////////
// 'IF STATEMENTS' are nested inside eachother 
// double myAge = 44;
// double votingAge = 21
// if ( myAge > votingAge ) { 
//  if ( mVoterRegistration ) {
//    System.out.println("qualified to Vote");
//    }
//  }
//
// else { 
//   System.out.println("something else")
// }


// when it comes to writing if statements, you can leave the curly braces out only if you have exactly
// one statement following the if conditional
// ^ never do that it is unnecessary and causes bugs

// 'ELSE IF' is a statement of an else command with an if statement in it

// ternary operator, 3 way operator with 'a ? b : c'  "?"  ";"

//boolean isHappy = true;
//String mood;
//if ( isHappy ) {
//    mood = "Happy";
//}
//else {
  //  mood = "Sad";
//}
// CAN MEAN THE SAME AS
//boolean isHappy = true;
//String mood;
//mood = (isHappy) ? "Happy" : "Sad";

// if isHappy is true? it will be assigned "happy" and if not : it will be assigned "sad"
// pretty much only relevant if you have two possible out comes but you could nest it, technically



// New concept: VARIABLE SCOPE

// once curly brace ends, all variables inside it are forgotten 
// the boundaries of scope are the curly braces

// if you get error '<variable name> cannot be resovled to a variable' its because the scope of your varible is not declared properly







    
    
}
}