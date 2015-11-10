///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* Kyle Kristiansen
10/2/2015
lab06 - getting loopy

what to do for the lab:
STEP 1:
    use a loop to generate a sequence of numbers up to seven
    use another loop to print out multiple 7's
    how many? a lot
    
STEP 2:
    create a while loop that prints all prime numbers from 10-100
    recreate this output using a "FOR LOOP" 
    recreate this output using a "DO-WHILE LOOP"
    you should be printing three different sets of all the prime numbers 
    
STEP 3:
    use any loop to print a "random number" of these guys o><
    print between 5 and 200 of them 
    modify loop so that no more than 20 o>< are printed per line

*/

public class GettingLoopy {
    
    public static void main(String[] args) {
        
        int num = 1; 
        int i = 0;
        System.out.println("Step 1:");
        while (num <= 7) {
            System.out.print(num);
            if (num == 7) {
                while (i <= 6) {
                    System.out.print(num);
                    i++;
                }
            }
            num++;
        }
        
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("Step 2: ");
        int num2 = 10;
        boolean prime;
        System.out.print("While loop: ");
        while (num2 <= 100) {
            prime = num2%2 != 0 && num2%3 != 0 && num2%5 != 0 && num2%7 != 0;
            if (prime) {
                System.out.print(num2 + " ");
            }
            num2++;
        }
        System.out.println("");
        
        
        // THIS IS HOW YOU DO A FOR LOOP!!!!!!!!!!!!!!!! DID NOT LEARN JUST OBSERVE IT AND FIGURE IT OUT
        
        System.out.print("For loop: ");
        for (int num3 = 10; num3 <= 100; num3++) {
            prime = num3%2 != 0 && num3%3 != 0 && num3%5 != 0 && num3%7 != 0;
            if (prime) {
                System.out.print(num3 + " ");
            }
        }
        System.out.println("");
        
        
        // THIS IS HOW YOU DO A DO-WHILE LOOOP!!!!!!!!!!!!!!!!!!! DID NOT LEARN THIS JUST OBSERVE AND FIGURE IT OUT
        
        System.out.print("Do-While loop: "); 
        int num4 = 10;
        do {
            prime = num4%2 != 0 && num4%3 != 0 && num4%5 != 0 && num4%7 != 0;
            if (prime) {
                System.out.print(num4 + " ");
            }
            num4++;
        } while (num4 <= 100);
        System.out.println("");
        System.out.println("");
       
       
       
        
        System.out.println("Step 3: ");
        int num5 = (int) (Math.random()*196 + 5);
        System.out.println(num5);
        int lines = num5/20;
        i = 1;
        while (i <= lines) {
            System.out.println("o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o>< o><");
            i++;
        }
        int rem = num5%20;
        i = 1;
        while (i <= rem) {
            System.out.print("o>< ");
            i++;
        }
        System.out.println("");
        
    }
}