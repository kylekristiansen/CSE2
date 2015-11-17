//////////////////////////////////////////////////////////////////////////////////////////
/*
Kyle Kristiansen
11-16-15
hw12

program - matrix transposition:

method to accept two input variables
    height : member arrays
    width : individual member of member arrays
method produces a two dimensional array in row major format

method to print the two dimensional array
introduce a test to check if the matrix being printed is rectangular
    if its not then print a warning 

method to transpose the 2D array

main method that uses all these methods
*/

import java.util.Scanner;
import java.util.Random;

public class Transpose {
    
    public static int[][] randomMatrix(int h, int w) {
        // h is height and w is width
        Random r = new Random();
        // row major format with the height being num of mem arrays
        int[][] twoD = new int[h][w];
        // for loop to assign random ints to each int spot in 2d array
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j <twoD[i].length; j++) {
                twoD[i][j] = r.nextInt(20) - 10;
            }
        }
        return twoD;
    }
    public static void printMatrix(int[][] twoD) {
        for (int i = 0; i < twoD.length; i++) {
            for (int k = 0; k < twoD[i].length; k++) {
                // this is the check to see if the arrays are ragged, will never be used in this program
                if (i>0) {
                    if (twoD[i].length != twoD[i-1].length) {
                        System.out.println("the 2D array is ragged, restart the program.");
                        return;
                    }
                }
                // printing each member of the arrays
                System.out.print(twoD[i][k] + "\t"); 
            }
            System.out.println();
            System.out.println();
            
        }
        return;
    }
    public static int[][] transposeMatrix(int[][] twoD) {
        int i = 0; // original height
        int j = 0; // original width
        // a counter array that has the width as height and the height as width of 2d arrray twoD
        int[][] output = new int[twoD[0].length][twoD.length];
        for (i = 0; i < twoD[0].length; i++) {
            for (j = 0; j < twoD.length; j++) {
                // flip flopping the parameters
                output[i][j] = twoD[j][i];
            }
        }
        return output;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("enter the height of an array: ");
        int i = 0;
        int height = 0;
        int width = 0;
        // typical check
        while (i == 0) {
            if (s.hasNextInt()) {
                height = s.nextInt();
                i = 1;
                if (height < 1) {
                    System.out.print("invalid input, enter a positive int for the height: ");
                    i = 0;
                }
            }
            else {
                System.out.print("invalid input, enter an int for the height: ");
                s.next();
            }
        }
        System.out.print("enter the width of an array: ");
        i = 0;
        while (i == 0) {
            if (s.hasNextInt()) {
                width = s.nextInt();
                i = 1;
                if (width < 1) {
                    System.out.print("invalid input, enter a positive int for the width: ");
                    i = 0;
                }
            }
            else {
                System.out.print("invalid input, enter an int for the width: ");
                s.next();
                i = 0;
            }
        }
        // creating main method arrays and then calling on methods to get their values
        int[][] matrix = randomMatrix(height, width);
        System.out.println("random matrix: ");
        printMatrix(matrix);
        // creating and printing the transposed array
        int[][] transposed = transposeMatrix(matrix);
        System.out.println("transposed random matrix: ");
        printMatrix(transposed);
    }
}