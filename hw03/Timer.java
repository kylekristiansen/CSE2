///////////////////////////////////////////////////////////////////////////////////
// Kyle Kristiansen
// hw03 - Timer
// 9/11/2015
//

// this is the first hw program
// its purpose is to 
//      prompt for the current time
//      prompt for the dinner reservation time
//      print the amount of hours and minutes until dinner

// begin by importing the scanner pre written program 

import java.util.Scanner;

// declare class and method

public class Timer {
    
    public static void main(String[] args) {
        
        // name the scanner and tell it that you are creating an instance in which you will input from STDIN
        Scanner myScanner = new Scanner ( System.in );
        // now the program is ready to accept input
        
        // get current time
        System.out.print("What is the current time, use millitary notation with XXXX form: "); 
        // tell the program to accept the int variable
        int currentTime = myScanner.nextInt(); 
        
        //get reservation time
        System.out.print("What time is your reservation, use millitary notation with XXXX form: ");
        // tell program to accept variable
        int resTime = myScanner.nextInt();
        
        // prompt variables and write equations to figure out time until reservation
        int timeTilRes;
        timeTilRes = resTime-currentTime;
        //System.out.println("time until reservation: " +timeTilRes);  // just way of checking up on program at this point in the code
        
        // break up time until res into its component parts
        int hours;
        int minutes;
        
        // reducing time until res into just hours.min and then cutting off the decimal
        hours = (int) (timeTilRes/100);
        System.out.println(hours);
        //System.out.println("hours til res: " +hours); // checking that it came out as the correct variable
        System.out.println(timeTilRes);
        // finding the remainder of min when 100 is multiplied into the time til res variable
        minutes = timeTilRes % 60;
        System.out.println(minutes);
        //System.out.println("min til res: " +minutes); // checking program
        
        System.out.println("you have " +hours+ " hours and " +minutes+ " minutes until dinner reservation");
        
        
    }
}