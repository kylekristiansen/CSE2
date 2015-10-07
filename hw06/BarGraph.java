////////////////////////////////////////////////////////////////////////////////////////////////
/* kyle kristiansen
hw 06
10/3/15
bargraph program
bargraph:
    creat program that prompts  you to imput expenses for each day of the week for one week
    expenses can have decimals 
    print weekly expenses using horizontal bar graphs made up of *'s
    
    calculate average expenses from the bar graphs 
    use random number generator to decide how much percentage expenses will increase or decrease for next week
    
*/
// calling on the scanner class
import java.util.Scanner;
// naming class
public class BarGraph {
    // declaring method
    public static void main(String[] args) {
        // naming scanner
        Scanner s = new Scanner (System.in);
        // prompting input of first variable
        System.out.print("how much spent on Mon:    $");
        // initializing day variable and the counter variable
        double mon = 0.0;
        int i = 0;
        // getting into a while loop to ensure that prompted input IS NOT a string or negative number
        while (i == 0) {
            // if statements use conditional to make sure that the number is either an int, double, or float
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                // accepting the input
                mon = s.nextDouble();
                // if statement to ensure that input is positive
                if (mon < 0.0) {
                    // if negative, printing string that will prompt for new input when the loops runs again
                    System.out.print("invalid input, negative int, please try again:    $");
                    // negative counter so that we do not leave the loop before getting proper input
                    i--;
                }
            }
            // else statement to prompt for new input if what was entered is anything but an int, double, or float
            else { 
                System.out.print("invalid input, not an int, please try again:      $");
                // command to find and return the next token from this scanner
                s.next();
                // decrement to make sure we dont leave the loop
                i--;
            }
            // increment to return counter to 0
            i++;
        }
        
        // i is equal to 1 now
        // doing everything i just described again
        System.out.print("how much spent on tues:   $");
        double tues = 0.0;
        while (i == 1) {
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                tues = s.nextDouble();
                if (tues < 0.0) {
                    System.out.print("invalid input, negative int, please try again:  $");
                    i--;
                }
            }
            else {
                System.out.print("invalid input, not an int, please try again:    $");
                s.next();
                i--; 
            }
            i++;
        }
        
        // i = 2 now
        
        System.out.print("how much spent on wed:    $");
        double wed = 0.0;
        while (i == 2) {
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                wed = s.nextDouble();
                if (wed < 0.0) {
                    System.out.print("invalid input, negative int, please try again:  $");
                    i--;
                }
            }
            else {
                System.out.print("invalid input, not an int, please try again:    $");
                s.next();
                i--; 
            }
            i++;
        }
        
        // i = 3 now
        System.out.print("how much spent on thurs:  $");
        double thurs = 0.0;
        while (i == 3) {
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                thurs = s.nextDouble();
                if (thurs < 0.0) {
                    System.out.print("invalid input, negative int, please try again:  $");
                    i--;
                }
            }
            else {
                System.out.print("invalid input, not an int, please try again:    $");
                s.next();
                i--; 
            }
            i++;
        }
        
        // i = 4 now
        System.out.print("how much spent on fri:    $");
        double fri = 0.0;
        while(i == 4) {
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                fri = s.nextDouble();
                if (fri < 0) {
                    System.out.print("invalid input, negative in, please try again:     $");
                    i--;
                }
            }
            else {
                System.out.print("invalid input, not an int, please try again:  $");
                s.next();
                i--;
            }
            i++;
        }
        
        // i = 5 now
        System.out.print("how much spent on sat:    $");
        double sat = 0.0;
        while (i == 5) {
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                sat = s.nextDouble();
                if (sat < 0) {
                    System.out.print("invalid input, negative int, please try again:     $");
                    i--;
                }
            }
            else {
                System.out.print("invalid input, not an int, please try again:  $");
                s.next();
                i--;
            }
            i++;
        }
        
        // i = 6
        System.out.print("how much spent on sun:    $");
        double sun = 0.0;
        while(i == 6) {
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                sun = s.nextDouble();
                if (sun < 0.0) {
                    System.out.print("invalid input, negative int, please try again:  $");
                    i--;
                }
            }
            else {
                System.out.print("invalid input, not an int, please try again:    $");
                s.next();
                i--; 
            }
            i++;
        }
        
        // command to round all of the day dollar amounts to integers so that they can print proper number of *'s
        mon = Math.round(mon);
        tues = Math.round(tues);
        wed = Math.round(wed);
        thurs = Math.round(thurs);
        fri = Math.round(fri);
        sat = Math.round(sat);
        sun = Math.round(sun);
        
        i = 1;
        // while loop first
        System.out.print("Monday:   ");
        // for every value of i up to the value of mon, an * will be printed
        while (i <= mon) {
            System.out.print("*");
            i++;
        }
        // skipping down a line
        System.out.println("");
        
        
        //for loop format
        System.out.print("Tuesday:  ");
        // different loop with same purpose as previous
        // the for loop seems to be the most effective and concise loop to use but i switched up what loop i was using just to practive
        for (i=1; i<=tues; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        
        i = 1;
        //do-while loop format
        System.out.print("Wednesday:");
        do {
            System.out.print("*");
            i++;
        } while (i <= wed);
        System.out.println("");
        

        // for looop seemed to be the easiest
        System.out.print("Thurday:  ");
        for (i=1; i <= thurs; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        
        i = 1;
        // back to the while loop
        System.out.print("Friday:   ");
        while (i <= fri) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        
        
        i = 1;
        // doin the do-while
        System.out.print("Saturday: ");
        do {
            System.out.print("*");
            i++;
        } while (i <= sat);
        System.out.println("");
        
        
        // back to the for
        System.out.print("Sunday:   ");
        for (i=1; i <= sun; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        
        double avgExp = 0.0;
        // equation to calculate average weekly exps
        avgExp = (mon + tues + wed + thurs + fri + sat + sun) / 7;
        // truncating avgexp to two decimal places
        avgExp = (int) (avgExp*100);
        avgExp = (double) avgExp / 100;
        System.out.println("Your average weekly expense is:     $" +avgExp);
        // counter is two because the first run through of the loop is accounted for by setting estimatedExp = avgExp
        i = 2;
        int flux = 0;
        double percent = 0.0;
        double weeklyExp = 0.0;
        double estimatedExp = avgExp;
        // while loop that will calculate and sum up every weeklyExp with the random flux applied to it 
        while (i <= 208) {
            // calling for random double from [0,1), stretching the upper bound so it is from [0,41) and then typecasting it to an int
            flux = (int) (Math.random()*41);
            // converting the flux to be a decimal percentage from [-.2,.2]
            percent = ((double) flux - 20) / 100;
            // getting the weekly expense for week i by multiplying average by percent
            weeklyExp = avgExp * (1 + percent);
            // truncating double to two decimal places
            weeklyExp = (int) (weeklyExp*100);
            weeklyExp = (double) weeklyExp / 100;
            // adding all weekly expenses together 
            estimatedExp += weeklyExp;
            // incrementing to jump to next week
            i++;
        }
        // truncating variable to two decimal places
        estimatedExp = (int) (estimatedExp*100);
        estimatedExp = (double) estimatedExp / 100;
        // printing out value of estimated expenditure
        System.out.println("Estimated expenditure for 4 years:  $" +estimatedExp);
   
    }
    
}