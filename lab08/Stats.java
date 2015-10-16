///////////////////////////////////////////////////////////////////////////////////////////////
/* Kyle Kristiansen
lab08
10/16/15

program: 
    input 5 doubles in increasing order
    check that doubles are increasing 
    compute mean, median, and then print both of the mean and median
    
    you must use:
        method that calculates mean
        method that calculates median
        void method called Print to print out the results
        
*/

import java.util.Scanner;

public class Stats {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        int i = 0;
        
        System.out.print("enter first number, make it your smallest number: ");
        double num1 = s.nextDouble();
        
        System.out.print("enter second number, bigger than the first: ");
        double num2 = 0.0;
        while (i == 0) {
            num2 = s.nextDouble();
            if (num2 <= num1) {
                System.out.print("invalid, input number larger than the previous: ");
                i--;
            }
            i++;
        }
        
        System.out.print("enter third number, bigger than the second: ");
        double num3 = 0.0;
        while (i == 1) {
            num3 = s.nextDouble();
            if (num3 <= num2) {
                System.out.print("invalid, input number larger than the previous: ");
                i--;
            }
            i++;
        }
        
        System.out.print("enter fourth number, bigger than the third: ");
        double num4 = 0.0;
        while (i == 2) {
            num4 = s.nextDouble();
            if (num4 <= num3) {
                System.out.print("invalid, input number larger than the previous: ");
                i--;
            }
            i++;
        }
        
        System.out.print("enter fifth number, bigger than the fourth: ");
        double num5 = 0.0;
        while (i == 3) {
            num5 = s.nextDouble();
            if (num5 <= num4) {
                System.out.print("invalid, input number larger than the previous: ");
                i--;
            }
            i++;
        }
        
        double mean = Mean(num1, num2, num3, num4, num5);
        
        double median = Median(num1, num2, num3, num4, num5);
        
        Print(mean, median);
        
    }

    public static double Mean( double num1, double num2, double num3, double num4, double num5 ) {
        double Mean = (num1+num2+num3+num4+num5) / 5.0;
        return Mean;
    }
    
    public static double Median( double num1, double num2, double num3, double num4, double num5 ) {
        double Median = num3;
        return Median;
    }
    
    public static void Print( double mean, double median ) {
        System.out.println("Mean: " +mean);
        System.out.println("Median: " +median);
    }
}
    
    