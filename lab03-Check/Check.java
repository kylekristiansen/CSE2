////////////////////////////////////////////////////////////////////////////////
// Kyle Kristiansen
// 9/11/2015
// Assignment Description:
//      write a program that takes the input:
//          cost of check
//          percentage tip
//          number of ways check will be split
//      Output:
//          how much each person must pay for the check

// import the scanner
import java.util.Scanner;

// declaring class and specifying main method
public class Check {
    
        public static void main(String[] args) {
            
            // prepare code to accept input
            // first step: declare instance of the Scanner object (myScanner) and call the Scanner instructor
            // we will declare instance so that scanner will take input from STDIN
            Scanner myScanner = new Scanner ( System.in ); 
            // now ready to accept input
            
            // prompting for first input
            System.out.print("Enter original cost of the check in the form xx.xx: ");
            // we use "print" instead of "println" so that the cursor does not skip down to the next line in the terminal
            
            //command to accept user input
            double checkCost = myScanner.nextDouble();
            // this command calls on a method that the Scanner has
            
            // prompting for next input
            System.out.print("Enter percentage tipe that you wish to pay as an int whole number xx: ");
            // command to accept the input
            double tipPercent = myScanner.nextDouble();
            // tipPercent is still in whole number form, must divide by 100
            tipPercent/= 100;
            
            // prompting for third variable
            System.out.print("Enter number of people who went out to dinner: ");
            // accept the variable
            int numPeople = myScanner.nextInt();
            
            // now create new variables for the total cost and cost per person and the change that we will need to represent
            
            double totalCost;
            double costPerPerson;
            int dollars;
            int dimes;
            int pennies; // will be necessary for controling what digets appear to the right of the decimals place
            
            // compute the cost per person using data inputs and equations
            totalCost = checkCost*(tipPercent+1); 
            costPerPerson = totalCost/numPeople;
            //System.out.println("double form of the cost per person: " +costPerPerson); // just a print statement to check on the progress of the system 
            // most likely the costPerPerson has an extended decimal so we must break it up into its component parts
            // first chop of the decimals for dollars
            dollars = (int) costPerPerson; 
            //System.out.println("integer form of dollars: " +dollars);
            dimes = (int) (costPerPerson*10) % 10; //   this is getting the tenths place on the left side of the decimal
            //                                          and then finding the remainder once 10 is factored into the int 
            //                                          we have
            //System.out.println("amount of dimes required: " +dimes);
            pennies = (int) (costPerPerson*100) % 10; // for same reason as dimes but to one more decimal place
            //System.out.println("amount of pennies required: " +pennies);
            
            // put the dollars, dimes, and pennies all together
            System.out.println("Each person in the group should pay: " +dollars+'.'+dimes+pennies);
            
            
        }
}