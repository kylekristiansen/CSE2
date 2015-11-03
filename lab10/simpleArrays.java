///////////////////////////////////////////////////////////////////////////////////
/*
Kyle Kristiansen
10/30/15
lab10

program:
    create array of strings of randomized size from 5 to 10
        use Math.random()
        array called students
    ask user to fill the array with different strings using a scanner
    creat second sarray same size as students
        called midterm
    fill array with randomized numbers from 0 to 100
    print out arrays so that each line has a student and a grade

*/

import java.util.Scanner;

public class simpleArrays {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        int size = (int) (Math.random()*6) + 5;
        //System.out.println(size);
        // initializing the array of strings with size 'size'
        String[] Names = new String[size];
        // for loop to assign each new name to a place in the array
        int i = 0; 
        System.out.println("Enter the names of " +size+ " students: ");
        for (i=0; i<size; i++) {
            // assigns the names to the next line entered in the scanner
            Names[i] = s.nextLine();
            //System.out.println("name " +i+ " is " +Names[i]); 
        }
        //System.out.println("completed");
        // int array for the grades with dimension of size
        int[] Grades = new int[size];
        // assigns grades to each place in the loop
        for (i=0; i<size; i++) {
            Grades[i] = (int) (Math.random()*101);
            //System.out.println(Grades[i]);
        }
        // for loop to print all names matched with their grades
        System.out.println("Here are the midterm grades of the 5 students: ");
        for (i=0; i<size; i++) {
            System.out.println(Names[i] + " : " + Grades[i]);
        }
    }
}