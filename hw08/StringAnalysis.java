////////////////////////////////////////////////////////////////////////////
/* Kyle Kristiansen
hw08 - string analysis
10/19/15

program:
    must process string by examining all the characters
    OR
    must process a specified number of characters in the string
    AND 
    determine if they are letters
    
    user INPUTS A STRING
    user INPUTS HOW MANY CHARACTERS THEY WANT TO ANALYZE IN THE STRING
    
    need 2 methods 
        must have SAME NAME
        both must return a BOOLEAN
            method 1:
                accept a STRING
            method 2:
                accept a STRING AND AN INT
                    int tells you how many characters to analyze,
                    if num of characters is greater than length of string,
                    stop when you get to end of string.
    
    <stringName>.charAt(<int i>) returns char at position i in string
    
    you can check if character is a letter by using the isLetter() method,
    of the character class by using >= and <= signs to compare the character,
    against other characters
        if char is between 'a' and 'z' it must be a letter
    
    make sure to check if input is valid
    
*/

import java.util.Scanner;

public class StringAnalysis {
    
    public static boolean method(String input) {
        // use to check that the string when equal to int are all letters
        int counter = input.length(); // counter equal to actual length of string
        int i = 0; 
        boolean output = true;
        
        while (i < counter) { // position i=0 will be position of first char of string
            //if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
            if (Character.isLetter(input.charAt(i))) {
                output = true;
            }
            else { // any char that isnt a letter returns false immediately and discontinues this method
                output = false;
                return output;
            }
            i++;
        }
        output = true;
        return output; // returns true if method can complete
    }
    
    public static boolean method(String input, int numToCheck) {
        // use to check that specific number of int in string are letters
        int i = 0;
        boolean output = true;
        if (numToCheck > input.length()) { // cutting down the numToCheck if it is larger than the input length
            numToCheck = input.length();
        }
        while (i < numToCheck) {
            //if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
            if (Character.isLetter(input.charAt(i))) {
                output = true;
            }
            else {
                output = false;
                return output;
            }
            i++;
        }
        output = true;
        return output;
        
    }
    
    public static int check(int random) {
        // use to accept int input and check that it is an int
        Scanner scan = new Scanner (System.in);
        System.out.print("input an int equal to how many character of string you want to evaluate: ");
        int i = 0;
        int output = 0;
        
        for (i=0; i==0; i++) { // loop to ensure that the user inputted an int
            if (scan.hasNextInt()) {
                output = scan.nextInt();
                if (output < 1) {
                    System.out.print("invalid int, re-enter: ");
                    i--;
                }
            }
            else {
                System.out.print("invalid int, re-enter: ");
                scan.next(); i--;
            }
        }
        return output; // returning the proper output in int type
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("input any string of your choosing: ");
        String input = "";
        
        input = s.next(); // getting string
        
        int random = 0; // just for the check method
        int numToCheck = 0;
        
        numToCheck = check(random); // getting input
        
        //System.out.println("string: " +input+ " int: " +numToCheck);
        
        boolean letters = true;
        boolean checkTrue = true;
        int num = 0;
        num = input.length(); // length of string
        //System.out.println("input.length(): " +num);
        
        if (num == numToCheck) {
            letters = method(input); // calling first method to check that string has letters
            //System.out.println("using the method with just string");
            if (letters == checkTrue) { //if method returned true, then this prints that its good and ends program
                System.out.println("String has only letters in it");
                return;
            }
            else {
                System.out.println("String does not have strictly letters in it");
                return; // ends program if string wasnt good
            }
        }
        else {
            letters = method(input, numToCheck); // uses second method because int input didnt match string length
            //System.out.println("using the method with string and int");
            if(letters == checkTrue) {
                System.out.println("Evaluated portion of string has only letters in it");
                return;
            }
            else {
                System.out.println("Evaluated portion of string does not have strictly letters in it");
                return;
            }
        }

       //System.out.println("num of letters: " +input.length());
    }

}