///////////////////////////////////////////////////////////////////////////////////
// Kyle Kristiansen
// 9/20/15
// 
// a simple poker hand interpreter
// program goals:

//      get dealt 5 cards, each from a different random deck
//          could get multiple of the same card
//      figure out if the cards contain:
//          a pair
//          two pair
//          three of a kind
//      if none of these combos exist, report that you have a 'high card hand'
//
// do not use loops, methods, or other constructs that we will learn later in the class

// hint1:
//      will need to produce many combos of boolean expressions in your work,
//      create temporary boolean variables to hold part of the comparison tests

// hint2:
//      if you print out identities of randomly generated variables then you can check that your code is working properly

// hint3:
//      use the scanner code to manually imput some variables so that you can check you code and dont have to keep generating random numbers

// get started:

// declaration of the class
public class PokerHandCheck {
    //declaration of the method: main
    public static void main(String[] args) {
        
        // selecting 5 random numbers and giving them 5 unique identifiers
        // each random selection goes from [0,1) so we must multiply by our upper bound and then add 1 to change the range to [1,53)
        int aCard = (int) (Math.random()*52) + 1;
        int bCard = (int) (Math.random()*52) + 1;
        int cCard = (int) (Math.random()*52) + 1;
        int dCard = (int) (Math.random()*52) + 1;
        int eCard = (int) (Math.random()*52) + 1;
        
        // declaring String variables for the suit of each random selection, these variables will be used later on in my code
        String aSuit = "";
        String bSuit = "";
        String cSuit = "";
        String dSuit = "";
        String eSuit = "";
        // declaring String variables for the number of each random selection, will be used further down in code
        String aNum = "";
        String bNum = "";
        String cNum = "";
        String dNum = "";
        String eNum = "";
        
        // assigning boolean identifiers to conditional statements that will determind the suit of my random variable selection
        boolean aDiamonds = 1 <= aCard && aCard < 14;
        boolean aClubs = 14 <= aCard && aCard < 27;
        boolean aHearts = 27 <= aCard && aCard < 40;
        boolean aSpades = 40 <= aCard && aCard < 53;
        
        // if statements using my preset conditional statements
        if ( aDiamonds ) { 
            // assigning the String that represents the suit of the card if the conditional statement 'aDiamonds' turns out to be true
            aSuit = "diamonds";
        }
        // same comments as made for previous statement
        if ( aClubs ) { 
            aSuit = "clubs";
        }
        if ( aHearts ) {
            aSuit = "hearts";
        }
        if ( aSpades ) {
            aSuit = "spades";
        }
        
        //System.out.println(aSuit); // check that a suit was declared
        
        // using the modulus command to reduce the card number to a number on the range of [0,12]
        aCard = aCard%13;
        
        // switching the int 'aCard' to a String variable 'aNum', each aNum value is unique depending on the value of the int
        switch (aCard) {
            case 1: 
                aNum = "ace";
                break;
            case 2: 
                aNum = "2";
                break;
            case 3:
                aNum = "3";
                break;
            case 4:
                aNum = "4";
                break;
            case 5:
                aNum = "5";
                break;
            case 6: 
                aNum = "6";
                break;
            case 7: 
                aNum = "7";
                break;
            case 8:
                aNum = "8";
                break;
            case 9:
                aNum = "9";
                break;
            case 10:
                aNum = "10";
                break;
            case 11:
                aNum = "jack";
                break;
            case 12: 
                aNum = "queen";
                break;
            case 0:
                aNum = "king";
                break;
        }
        
        //System.out.println(aNum); // checking that aNum was declared
        
        // all the statements for this section are the same as the one before it, 
        // due to the fact that it is the same process but just for my second random variable 
        boolean bDiamonds = 1 <= bCard && bCard < 14;
        boolean bClubs = 14 <= bCard && bCard < 27;
        boolean bHearts = 27 <= bCard && bCard < 40;
        boolean bSpades = 40 <= bCard && bCard < 53;
        
        if ( bDiamonds ) { 
            bSuit = "diamonds";
        }
        if ( bClubs ) { 
            bSuit = "clubs";
        }
        if ( bHearts ) {
            bSuit = "hearts";
        }
        if ( bSpades ) {
            bSuit = "spades";
        }
        
        //System.out.println(bSuit);
        
        bCard = bCard%13;
        
        switch (bCard) {
            case 1: 
                bNum = "ace";
                break;
            case 2: 
                bNum = "2";
                break;
            case 3:
                bNum = "3";
                break;
            case 4:
                bNum = "4";
                break;
            case 5:
                bNum = "5";
                break;
            case 6: 
                bNum = "6";
                break;
            case 7: 
                bNum = "7";
                break;
            case 8:
                bNum = "8";
                break;
            case 9:
                bNum = "9";
                break;
            case 10:
                bNum = "10";
                break;
            case 11:
                bNum = "jack";
                break;
            case 12: 
                bNum = "queen";
                break;
            case 0:
                bNum = "king";
                break;
        }
        
        //System.out.println(bNum);
        
        
        boolean cDiamonds = 1 <= cCard && cCard < 14;
        boolean cClubs = 14 <= cCard && cCard < 27;
        boolean cHearts = 27 <= cCard && cCard < 40;
        boolean cSpades = 40 <= cCard && cCard < 53;
        
        if ( cDiamonds ) { 
            cSuit = "diamonds";
        }
        if ( cClubs ) { 
            cSuit = "clubs";
        }
        if ( cHearts ) {
            cSuit = "hearts";
        }
        if ( cSpades ) {
            cSuit = "spades";
        }
        
        //System.out.println(cSuit);
        
        cCard = cCard%13;
        
        switch (cCard) {
            case 1: 
                cNum = "ace";
                break;
            case 2: 
                cNum = "2";
                break;
            case 3:
                cNum = "3";
                break;
            case 4:
                cNum = "4";
                break;
            case 5:
                cNum = "5";
                break;
            case 6: 
                cNum = "6";
                break;
            case 7: 
                cNum = "7";
                break;
            case 8:
                cNum = "8";
                break;
            case 9:
                cNum = "9";
                break;
            case 10:
                cNum = "10";
                break;
            case 11:
                cNum = "jack";
                break;
            case 12: 
                cNum = "queen";
                break;
            case 0:
                cNum = "king";
                break;
        }
        
        //System.out.println(cNum);
        
        
        boolean dDiamonds = 1 <= dCard && dCard < 14;
        boolean dClubs = 14 <= dCard && dCard < 27;
        boolean dHearts = 27 <= dCard && dCard < 40;
        boolean dSpades = 40 <= dCard && dCard < 53;
        
        if ( dDiamonds ) { 
            dSuit = "diamonds";
        }
        if ( dClubs ) { 
            dSuit = "clubs";
        }
        if ( dHearts ) {
            dSuit = "hearts";
        }
        if ( dSpades ) {
            dSuit = "spades";
        }
        
        //System.out.println(dSuit);
        
        dCard = dCard%13;
        
        switch (dCard) {
            case 1: 
                dNum = "ace";
                break;
            case 2: 
                dNum = "2";
                break;
            case 3:
                dNum = "3";
                break;
            case 4:
                dNum = "4";
                break;
            case 5:
                dNum = "5";
                break;
            case 6: 
                dNum = "6";
                break;
            case 7: 
                dNum = "7";
                break;
            case 8:
                dNum = "8";
                break;
            case 9:
                dNum = "9";
                break;
            case 10:
                dNum = "10";
                break;
            case 11:
                dNum = "jack";
                break;
            case 12: 
                dNum = "queen";
                break;
            case 0:
                dNum = "king";
                break;
        }
        
        //System.out.println(dNum);
        
        
        boolean eDiamonds = 1 <= eCard && eCard < 14;
        boolean eClubs = 14 <= eCard && eCard < 27;
        boolean eHearts = 27 <= eCard && eCard < 40;
        boolean eSpades = 40 <= eCard && eCard < 53;
        
        if ( eDiamonds ) { 
            eSuit = "diamonds";
        }
        if ( eClubs ) { 
            eSuit = "clubs";
        }
        if ( eHearts ) {
            eSuit = "hearts";
        }
        if ( eSpades ) {
            eSuit = "spades";
        }
        
        //System.out.println(eSuit);
        
        eCard = eCard%13;
        
        switch (eCard) {
            case 1: 
                eNum = "ace";
                break;
            case 2: 
                eNum = "2";
                break;
            case 3:
                eNum = "3";
                break;
            case 4:
                eNum = "4";
                break;
            case 5:
                eNum = "5";
                break;
            case 6: 
                eNum = "6";
                break;
            case 7: 
                eNum = "7";
                break;
            case 8:
                eNum = "8";
                break;
            case 9:
                eNum = "9";
                break;
            case 10:
                eNum = "10";
                break;
            case 11:
                eNum = "jack";
                break;
            case 12: 
                eNum = "queen";
                break;
            case 0:
                eNum = "king";
                break;
        }
        
        //System.out.println(eNum);
        
        // now that all of the random variables have been converted to String variables representing their suit and number,
        // we must check for any combos of 2 sets of doubles, 1 set of a triple, or 1 set of a double,
        // and if none of these are present then we will declare the hand to be a 'high card hand'
        
        // checking for 2 of a kind by assigning a boolean variable to the conditional statement that
        // says every possible combo of two nums being equivalent to one another
        boolean pair2 = aNum.equals(bNum) || aNum.equals(cNum) || aNum.equals(dNum) || aNum.equals(eNum) || bNum.equals(cNum) || bNum.equals(dNum) || bNum.equals(eNum) || cNum.equals(dNum) || cNum.equals(eNum) || dNum.equals(eNum);
        
        //System.out.println(pair2); // checking if the conditional achieved its intended purpose
        
        // checking for 3 of a kind by setting two diff nums equivalent to the same num in every possible combo for 5 different nums
        boolean pair3 = (aNum.equals(bNum) && aNum.equals(cNum)) || (aNum.equals(bNum) && aNum.equals(dNum)) || (aNum.equals(bNum) && aNum.equals(eNum)) || (aNum.equals(cNum) && aNum.equals(dNum)) || (aNum.equals(cNum) && aNum.equals(eNum)) || (aNum.equals(dNum) && aNum.equals(eNum)) || (bNum.equals(cNum) && bNum.equals(dNum)) || (bNum.equals(cNum) && bNum.equals(eNum)) || (bNum.equals(dNum) && bNum.equals(eNum)) || (cNum.equals(dNum) && cNum.equals(eNum));
        
        //System.out.println(pair3); // checking if the conditional achieved its intended purpose
        
        // checking for two pairs
        // by creating a conditional that says one pair and another pair equivalent to each other for every combo that 5 cards can make
        boolean twoPairs = (aNum.equals(bNum) && cNum.equals(dNum)) || (aNum.equals(bNum) && cNum.equals(eNum)) || (aNum.equals(bNum) && dNum.equals(eNum)) || (aNum.equals(cNum) && bNum.equals(dNum)) || (aNum.equals(cNum) && bNum.equals(eNum)) || (aNum.equals(cNum) && dNum.equals(eNum)) || (aNum.equals(dNum) && bNum.equals(cNum)) || (aNum.equals(dNum) && bNum.equals(eNum)) || (aNum.equals(dNum) && cNum.equals(eNum)) || (aNum.equals(eNum) && bNum.equals(cNum)) || (aNum.equals(eNum) && bNum.equals(dNum)) || (aNum.equals(dNum) && cNum.equals(dNum)) || (bNum.equals(cNum) && dNum.equals(eNum)) || (bNum.equals(dNum) && cNum.equals(eNum)) || (bNum.equals(eNum) && cNum.equals(dNum));
        
        //System.out.println(twoPairs); // checking if the conditional achieved its intended purpose 
        
        // printing results for what cards you randomly drew
        System.out.println("You drew the: ");
        System.out.println("  " +aNum+ " of " +aSuit);
        System.out.println("  " +bNum+ " of " +bSuit);
        System.out.println("  " +cNum+ " of " +cSuit);
        System.out.println("  " +dNum+ " of " +dSuit);
        System.out.println("  " +eNum+ " of " +eSuit);
        System.out.println("");
        
        // conditional statements that print the results of getting two sets of doubles, a triple, one double, or a high card hand
        if ( twoPairs ) {
            System.out.println("you have two sets of doubles");
        }
        if ( pair3 ) {
            System.out.println("you hava a triple");
        }
        if ( pair2 && !twoPairs && !pair3 ) { 
            System.out.println("you have a double");
        }
        if( !pair2 && !twoPairs && !pair3) {
            System.out.println("you have a high card hand");
        }
        
    }//ending the method

}//ending the class