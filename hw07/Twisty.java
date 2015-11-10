/////////////////////////////////////////////////////////////////////////////////
/* kyle kristiansen
10/11/2015
hw07 - Twisty

program:
    prompt user for LENGTH and WIDTH 
    length is how many characters horizontally
    width is how many characters vertically 
    input should look like a twisting zig zag

*/

import java.util.Scanner;

public class Twisty {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        int horiz = 0;
        int i = 0;
        
        System.out.print("input desired length (horizontal length): ");
        
        while (i == 0) {
            // peeking at the input to check if it is an int
            if (s.hasNextInt()) {
                // identifying the input
                horiz = s.nextInt();
                // if statement to check that input is in proper range
                if(horiz < 0 || 80 < horiz) {
                    System.out.print("incorrect input, please input int from 0 to 80: ");
                    i--;
                }
            }
            // else statement to handle strings
            else {
                System.out.print("incorrect input, please input int from 0 to 80: ");
                s.next();
                i--;
            }
            // counter to get out of the loop
            i++;
        }
        
        // i is 1 now
        int vert = 0;
        
        System.out.print("Input desired width (vertical height): ");
        
        // while loop to check that input is an int 
        while (i == 1) {
            // peeking at the input to check if it is an int
            if (s.hasNextInt()) {
                // identifying the input
                vert = s.nextInt();
                // if statement to check that input is in proper range
                if(vert < 0 || horiz < vert) {
                    System.out.print("incorrect input, please input int from 0 to your previous input: ");
                    i--;
                }
            }
            // else statement to handle strings
            else {
                System.out.print("incorrect input, please input int from 0 to your previous input: ");
                s.next();
                i--;
            }
            // counter to get out of the loop
            i++;
        }
        // initializing counters 
        int j = 0;
        int k = 0;
        // for loop to manage the vertical rows in twisty design
        for (j=0; j < vert; j++) {
            // for loop to manage what gets printed on each individual row
            for (k=0; k < horiz; k++) {
                // if statement that gets hit if the spot in the row is a part of the downward right sloping half of the X
                if ( k%vert == j ) {
                    // if statement that gets caught if the vertical input is an odd number
                    if (vert%2 == 1)  {
                        // if statement that is reached if both the k var and j var are even numbers indicating that a # should be printed
                        if ( k%2 == j%2) {
                            System.out.print("#");
                        }
                        // if the loop has gotten to this point and not printed a # then it should print a '\' but to do this, you need to print double since its an escape character
                        else {
                            System.out.print("\\");
                        }
                    }
                    // this else statement gets caught if the vert input was not an odd number
                    else {
                        // if you divide the k var by the vert input and it is an even number (an even factor of the k var) then print a #
                        if (((k/vert)%2) == 4%2) {
                            System.out.print("#");
                        }
                        // if the else is hit and you dont print a #, print a \
                        else {
                            System.out.print("\\");
                        }
                    }
                }
                // this else if gets hit if you are working with an upward slanting half of the individual X
                else if ( k%vert == vert - (j+1) ) {
                    // this if statement gets hit if the vert is an odd number
                    if (vert%2 == 1) {    
                        // this if gets hit if the k and j are even so you print a /
                        if (k%2 == j%2) {
                            System.out.print("/");
                        }
                        // print # if this is reached and not a /
                        else {
                            System.out.print("#");
                        }
                    }
                    // if the vert was not an odd number then you execute this else statement
                    else {
                        // if you are working with the even factor of the vert then print a /
                        if (((k/vert)%2) == 0) {
                            System.out.print("/");
                        }
                        // if you make it here and dont print the /, print a #
                        else {
                            System.out.print("#");
                        }
                    }
                }
                // if none of the previous statements are true, print a space
                else {
                    System.out.print(" ");
                }
            }
            // skip to next line 
            System.out.println("");
        }
        // create space after the design
        System.out.println("");
    }
}