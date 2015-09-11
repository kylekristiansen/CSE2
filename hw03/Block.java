///////////////////////////////////////////////////////////////////////////////////////////
// Kyle Kristiansen
// hw03 program 2
// 9/11/2015
//

// the purpose of this program is to:
//      prompt user for the LENGTH, WIDTH, and HEIGHT of a block
//      calculate 
//          volume
//          surface area
//      measurements should all be of type double

// import the scanner
import java.util.Scanner;

// declare class and method

public class Block { 
    
    public static void main(String[] args) { 
        
        // name the scanner and tell it that you are creating an instance in which it will receive inputs
        Scanner myScanner = new Scanner ( System.in );
        
        // cue the input and tell scanner to accept it 
        System.out.print("the length of the block is: ");
        double length = myScanner.nextDouble(); 
        
        // cue next imput and tell scanner to accept it
        System.out.print("the width of the block is: ");
        double width = myScanner.nextDouble();
        
        // cue final input and tell scanner to accept it
        System.out.print("the height of the block is: "); 
        double height = myScanner.nextDouble();
        
        // define variables you want to find and then make equations to calculate them
        double volume;
        double surfArea;
        
        // volume equation
        volume = length*width*height; 
        // surface area equation
        surfArea = 2*(length*width) + 2*(length*height) + 2*(width*height);
        
        // state the results
        System.out.println("For a block of dimensions " +length+ " x " +width+ " x " +height+ ":");
        System.out.println("Volume = " +volume);
        System.out.println("Surface Area = " +surfArea); 

        
    }
    
}