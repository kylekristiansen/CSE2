//////////////////////////////////////////////////////////////////////////////////////
/*
Kyle Kristiansen
hw11 - CSE2Linear
11/10/15

program:
    prompt user to enter 15 ints for students' final grades
    check that only ints are entered
    print an error message if a non int is entered
    print an error message if an int is entered out of the range from 0 to 100
    print an error message if the ints are not inputted in increasing order
        sort them if they are out of order
        print array
    prompt user to enter a grade to be searched for
    use linear search o find entered grade
    indicate if grade was not found
    print number of iterations used
    scramble the sorted array randomly
    print scrambled array
    prompt user to enter another int to be searched for
    use linear search to find grade
    print if grade was found or not 
    print number of iterations used
    
*/

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    // 3 print methods that make printing easier to write out in code
    public static void println(String anything) {
        System.out.println(anything);
    }
    public static void print(String anything) {
        System.out.print(anything);
    }
    public static void printar(int[] anything) {
        for (int i = 0; i < anything.length; i++) {
            System.out.print(anything[i] + " ");
        }
        System.out.println();
    }
    // the code to sort my array into increasing order
    public static int[] sort(int[] grades) {
        int currentMin = 0;
        int theMinIndex = 0;
        // as j increased to 1 spot before the end, set its value and its index value to identifiers to serve as place holders
        for (int j = 0; j < grades.length - 1; j++) {
            currentMin = grades[j];
            theMinIndex = j;
            // each grades[k] is one higher than the grades[j] 
            for (int k = j + 1; k < grades.length; k++) {
                // when grades[j] is larger than grades[k], redefine the current min and index
                if (currentMin > grades[k]) {
                    currentMin = grades[k];
                    theMinIndex = k;
                }
            }
            // if the grades[j] index does not match the var j, reset the values to the ones we found in previous for loop
            if (theMinIndex != j) {
                grades[theMinIndex] = grades[j];
                grades[j] = currentMin;
            }
        }
        return grades;
    }
    public static void linearSearch(int[] grades, int key) {
        int iterations = 0;
        int counter = 0;
        // for loop to check every index spot until it finds one equal to the key
        for (int i = 0; i<grades.length; i++) {
            if (grades[i] == key) {
                iterations = i;
                println("the key " + key + " was found after " +iterations+ " iterations");
            }
            // way to count up how many times we did not find the key
            else {
                counter++;
            }
        }
        // if we did not find the key, then the counter will be equal to 15
        if (counter == 15) {
            println("the key " + key + " was not found after " +counter+ " iterations");
        }
    }
    public static int[] scramble(int[] grades) {
        Random r = new Random();
        int index = 0;
        int num = 0;
        // scrambling for loop
        for (int i = 0; i < grades.length; i++) {
            // getting random index
            index = r.nextInt(grades.length);
            // place holder for grades[i]
            num = grades[i];
            // flip flopping grades with a random index with grades[i]
            grades[i] = grades[index];
            grades[index] = num;
        }
        return grades;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        Random r = new Random();
        
        print("enter 15 ints in increasing order for students final grades: ");
        int[] grades = new int[15];
        int i = 0;
        grades[0] = s.nextInt();
        // for loop the assigns each grades[i] to an inputed value unless that value is out of range or not an int
        for (i=1; i < grades.length; i++) {
            if (s.hasNextInt()) {
                grades[i] = s.nextInt();
                if (grades[i] < 0 || grades[i] > 100) {
                    print("int exceeds grading range, reenter: ");
                    grades[i] = s.nextInt();
                }
                /*if (grades[i] < grades[i-1]) {
                    print("int must be increasing, reenter an input greater than the last: ");
                    grades[i] = s.nextInt();
                }
*/            }
            else {
                print("not an int, reenter: ");
                s.next();
            }
        }
        boolean isArraySorted = true;
        for (i=1; i<grades.length; i++) {
            if (grades[i-1] > grades[i]) {
                isArraySorted = false;
                println("array is not sorted in increasing order");
                i = grades.length;
                
            }
        }
        
        // defining new array and then calling on the sort method
        int[] gSorted = new int[15];
        
        if (isArraySorted == false) {
            println("sorted array:");
            gSorted = sort(grades);
            // print method
            printar(gSorted); 
        }
        
        print("enter a grade to search for: ");
        int key = s.nextInt();
        // lin search method looking for the key
        linearSearch(gSorted, key);
        //linearSearch(grades, key);
        
        println("Scrambled: ");
        // declaring scramble array and then scrambling the sorted array
        int[] gScrambled = new int[15];
        gScrambled = scramble(gSorted);
        //gScrambled = scramble(grades);
        printar(gScrambled);
        
        print("enter a grade to search for: ");
        int key2 = s.nextInt();
        // linear search method for the new key value
        linearSearch(gScrambled, key2);
        
    }

}