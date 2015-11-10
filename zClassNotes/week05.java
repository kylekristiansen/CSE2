//////////////////////////////////////////////////////////////
// week 5 notes - MONDAY

// finishing up lecture 8

// switches

import java.util.Scanner;

public class week05 { 
    
    public static void main(String[] args) { 
        
        // when comparing strings: 
        //      USE THE 'STRING.EQUALS(STRING)'
        
        // switch statements work with switching one type to another type
        // each case must be in the original type
        
        switch (int expression) {
            case value1:
                statement;
                break;
            case value2:
                statement;
                break;
            default: //always activates if you hit this case
                statement;
                break;
            case value3: // this case would never be reached because the default comes before it 
                statement;
                break;
            }
            
            //ternary conditional is a lazy way of writing if statements
            
            //  FORMATTED OUTPUT
            
            System.out.printf("you owe %4.2f\n", 1.0-.9);
            // always start with % - format specifier 
            
            //  %4.2f means : substitute a floating point number that takes up at least 4 spaces with 2 digits after the decimal
            // %b - boolean value
            // %c - charater 
            // %d - decimal integer
            // %e - numberin scientific notation
            // %s - string value
            
            
    }
    
}