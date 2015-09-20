/////////////////////////////////////////////////////////////////////////////////
// Kyle Kristiansen
// Lab 04
// fundamentals of programming - random card generator

// assignment:
//      write program that will pick a random card from the deck
//      select number from 1 to 52
//      suits are grouped diamonds, clubs, hearts, spades
//      

// declare a class
public class CardGenerator { 
    
    // select method
    public static void main(String[] args) { 
        
        // in order to generate the random number we want, we must generate a random double in [0,1), then adapt it to our needs
        // to adapt it we will multiply it by our upper bound, and add 1 so that our lowerest random number will be a 1 and highest a 52
        // also will type cast to an int to remove any decimals
        int card = (int) ((Math.random()*52) + 1);
        
        // must create variables to hold the our info categorized info, either the suit or number of the card
        String suit = "";
        String num = ""; 
        
        // if statements to define the suit of each card depending on where it falls between 1 and 52
        // the lazy '&&' must be used to link the two true/false statements because without it the comparison statement doesnt work
        if (1 <= card && card < 14) {
            suit = "diamonds";
            //System.out.println(suit); // a check to show that if statements were working
        }
        if (14 <= card && card < 27) {
            suit = "clubs";
            //System.out.println(suit); // a check to show that if statements were working
        }
        if (27 <= card && card < 40) {
            suit = "hearts";
            //System.out.println(suit); // a check to show that if statements were working
        }
        if (40 <= card && card < 53) {
            suit = "spades";
            //System.out.println(suit); // a check to show that if statements were working
        }
        
        //System.out.println(card);
        
        // using the modulous command to get every number as an int between 0-12
        // we do this by dividing the 'card' variable by 13 and finding the remainder
        card = card%13; 
        
        //System.out.println(card);
        
        // now switching variable 'card' to a string for every different int value that it could be between 0 and 12    
        switch (card) {
            case 1: 
                num = "ace";
                break;
            case 2:
                num = "2";
                break;
            case 3:
                num = "3";
                break;
            case 4:
                num = "4";
                break;
            case 5:
                num = "5";
                break;
            case 6: 
                num = "6";
                break;
            case 7: 
                num = "7";
                break;
            case 8:
                num = "8";
                break;
            case 9:
                num = "9";
                break;
            case 10:
                num = "10";
                break;
            case 11:
                num = "jack";
                break;
            case 12: 
                num = "queen";
                break;
            case 0:
                num = "king";
                break;
        }
                
        //System.out.println(num); // check for what new string info num has been reassigned to 
        
        // final statement that tells you what card you got of which particular suits
        System.out.println("you picked a " +num+ " of " +suit);
      
    }
    
}







