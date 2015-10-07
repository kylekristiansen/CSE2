///////////////////////////////////////////////////////////////////////////////////////////////////
/* Kyle Kristiansen
Hw06 - checkdigit - second program
10/6/15

program:
    must develop an isbn validator
    prompt user for 10 digit number
    use loop to verify if the number meets the criteria to be a valid isbn
    determine check digit that would validate the isbn
    use letter 'X' to represent a check digit of 10

*/
// calling on the scanner operating program
import java.util.Scanner;
// naming the class
public class CheckDigit {
    // claiming the main method   
    public static void main(String[] args) {
        // naming scanner 's'
        Scanner s = new Scanner (System.in);
        // prompting for the ISBN number
        System.out.print("enter a 10 digit ISBN code: ");
        // naming string
        String barcode = "";
        // claiming counter
        int i = 0;
        // for loop to check the ISBN codes are in proper form
        for (i = 0; i==0; i++) {
            // if the input is a string...
            if (s.hasNextLine()) {
                // accept the input
                barcode = s.next();
                // if the input is not 10 digits long....
                if (barcode.length() != 10) {
                    // prompt new input and cycle back to beginning of loop
                    System.out.print("invalid barcode, not an isbn, enter 10 digits:    ");
                    i--;
        }   }   }
        //System.out.println("barcode: " +barcode);// mid code check
        // prompting for counters of variables to be used in following loops
        int j = 0;
        int sum = 0;
        int p = 10;
        // for loop to run the switching of each char in string to values that are added together to get the isbn sum
        for (j = 0; j <= 8; j++) {
            // command 'barcode.charAt(j)' selects each individual char and runs it through the converting switch statements to get proper int
            switch (barcode.charAt(j)) {
                case '0':
                    sum += p*0;  
                    break;
                case '1':
                    sum += p*1; 
                    break;
                case '2':
                    sum += p*2;
                    break;
                case '3':
                    sum += p*3;
                    break;
                case '4':
                    sum += p*4;
                    break;
                case '5':
                    sum += p*5;
                    break;
                case '6':
                    sum += p*6;
                    break;
                case '7':
                    sum += p*7;
                    break;
                case '8':
                    sum += p*8;
                    break;
                default:
                    System.out.println("invalid ISBN, enter 10 digit int without letters in the middle, restart program");
                    return;
            }
            p--;
        }
        
        //System.out.println("sum " +sum);
        // calculating what the proper check digit should have been
        int properCheck = sum%11;
        int checkDigit = 0;
        // switching all the final digits in the ISBN to their equivalant int value
        switch (barcode.charAt(9)) {
                case '0':
                    checkDigit = 0;  
                    break;
                case '1':
                    checkDigit = 1; 
                    break;
                case '2':
                    checkDigit = 2;
                    break;
                case '3':
                    checkDigit = 3;
                    break;
                case '4':
                    checkDigit = 4;
                    break;
                case '5':
                    checkDigit = 5;
                    break;
                case '6':
                    checkDigit = 6;
                    break;
                case '7':
                    checkDigit = 7;
                    break;
                case '8':
                    checkDigit = 8;
                    break;
                case '9':
                    checkDigit = 9;
                    break;
                case 'X':
                    checkDigit = 10;
                    break;
        }
        
        //System.out.println("proper check " +properCheck+ " check digit " +checkDigit);    
        // series of if statements to determine the results of the input 
        char finalCheck = 'X';
        
        if (properCheck != checkDigit && properCheck != 10) {
            System.out.println("invalid ISBN, check digit should be:    " +properCheck);
        }
        
        if (properCheck == 10 && checkDigit != 10) {
                switch (properCheck) {
                    case 10:
                        finalCheck = 'X';
                        break;
                }
                System.out.println("invalid ISBN, check digit should be:    " +finalCheck);
        }
        
        if (properCheck == checkDigit) {
            System.out.println("valid ISBN, good job");
        }
        
        
        
        
    }
}

/*
 * System.out.print("how much spent on Mon:    $");
        // initializing day variable and the counter variable
        double mon = 0.0;
        int i = 0;
        // getting into a while loop to ensure that prompted input IS NOT a string or negative number
        while (i == 0) {
            // if statements use conditional to make sure that the number is either an int, double, or float
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                // accepting the input
                mon = s.nextDouble();
                // if statement to ensure that input is positive
                if (mon < 0.0) {
                    // if negative, printing string that will prompt for new input when the loops runs again
                    System.out.print("invalid input, negative int, please try again:    $");
                    // negative counter so that we do not leave the loop before getting proper input
                    i--;
                }
            }
            // else statement to prompt for new input if what was entered is anything but an int, double, or float
            else { 
                System.out.print("invalid input, not an int, please try again:      $");
                // command to find and return the next token from this scanner
                s.next();
                // decrement to make sure we dont leave the loop
                i--;
            }
            // increment to return counter to 0
            i++;
        }
 */