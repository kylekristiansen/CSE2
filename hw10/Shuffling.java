///////////////////////////////////////////////////////////////
/*
Kyle Kristiansen
hw10 - Shuffling
11/03/15

Program:
    provided
    
    write methods that will shuffle the arrays to the specifications given

*/

import java.util.Scanner;

import java.util.Collections;

public class Shuffling {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        //suits club, heart, spade or diamond
        String[] suitNames = {"C", "H", "S", "D"};
        String[] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        // strings to hold deck of cards and the hand we will draw
        String[] cards = new String[52];
        String[] hand = new String[5];
        
        for (int i = 0; i<52; i++) {
            cards[i] = rankNames[i%13] + suitNames[i/13];
            System.out.print(cards[i] + " ");
        }
        printArray(cards);
        shuffle(cards); 
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }
    // void loop that returns nothing and accepts a string array
    public static void printArray(String[] cards) {
        // for loop that will print all the cards out
        for (int j = 0; j<cards.length; j++) {
            System.out.print(cards[j] + " ");
        }
        System.out.println();
    }
    // same type of loop as before with different name
    public static void shuffle(String[] cards) {
        // a swap variable the will switch cards to different positions
        int swap = 0;
        // for loop for randomizing cards
        for (int j = 0; j<cards.length; j++) {
            // swap will be rand variable from 0 to 51
            swap = (int) (Math.random()*52);
            // setting the increment of cards to the swap position in array cards
            cards[j] = cards[swap];
        }
        // printing for loop
        for (int i = 0; i<cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.println();
    }
    // this method accepts a string array and returns a string array
    public static String[] randomizeHand(String[] cards) {
        // initializing wht we will return and how many positions it will have
        String[] hand = new String[5];
        
        int[] num = new int[5];
        // a very round about way without a loop for assigning random numbers to each num
        num[0] = (int) (Math.random()*52);
        num[1] = (int) (Math.random()*52);
        num[2] = (int) (Math.random()*52);
        num[3] = (int) (Math.random()*52);
        num[4] = (int) (Math.random()*52);
        // a very unconventional loop for checking if any nums are equal to each other and changing them so that it doesnt happen
        while (num[0] == num[1] || num[0] == num[2] || num[0] == num[3] || num[0] == num[4] || num[1] == num[2] || num[1] == num[3] || num[1] == num[4] || num[2] == num[3] || num[2] == num[4] || num[3] == num[4]) {
            num[0] = (int) (Math.random()*52);
            num[1] = (int) (Math.random()*52);
            num[2] = (int) (Math.random()*52);
            num[3] = (int) (Math.random()*52);
            num[4] = (int) (Math.random()*52);
        }
		// loop assigning the num values to the cards in your hand
        for (int j = 0; j<5; j++) {
            hand[j] = cards[num[j]];
        }
        // returning your string array
        return hand;
    }
    
    
    
    
    
    
    
    
    
    
}
