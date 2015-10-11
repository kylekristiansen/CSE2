///////////////////////////////////////////////////////////////////////////////////
/* Kyle Kristiansen
10/11/2015
lab07 -  encrypted x

program:
    print out an x by printing a handful of stars to only show the x in the spaces
    
    ask for input
        integer between 0 and 100
    store input in integer called 'input' 
    integer will be the size of the square that the x will appear in

*/
// importing scanner 
import java.util.Scanner;
// naming class
public class encrypted_x {
    // decalring method
    public static void main(String[] args) {
        // naming the scanner
        Scanner s = new Scanner (System.in);
        // naming the input variable and counter variable
        int input = 0;
        int i = 0;
        // prompting for the input variable
        System.out.print("enter int from 0 to 100: ");
        // while loop to check that input is an int from 0 to 100
        while (i == 0) {
            // peeking at the input to check if it is an int
            if (s.hasNextInt()) {
                // identifying the input
                input = s.nextInt();
                // if statement to check that input is in proper range
                if(input < 0 || 100 < input) {
                    System.out.print("incorrect input, please input int from 0 to 100: ");
                    i--;
                }
            }
            // else statement to handle strings
            else {
                System.out.print("incorrect input, please input int from 0 to 100: ");
                s.next();
                i--;
            }
            // counter to get out of the loop
            i++;
        }
        // identifying new counter
        int j = 0;
        
        // this for loop decides how many rows to print
        for (i=0; i<input; i++) {
            // this for loop decides what gets printed in each row
            for (j=0; j<input; j++) {
                if (j == i) {
                    System.out.print(" ");
                }
                else if (j == input - (i + 1)) {
                    System.out.print(" ");
                    //System.out.print("OO");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}