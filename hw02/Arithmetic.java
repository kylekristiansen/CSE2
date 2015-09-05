/////////////////////////////////////////////////////////////////////////////////
// Kyle Kristiansen
// hw02
// 9-4-15
// 
// objective of hw is to get practive manipulating data stored in variables

// compile code
//    javac ArithmeticCalculations.java
// run code
//    java ArithmeticCacluations//

// declare class, 'class' with a lower case c

public class Arithmetic {

    public static void main(String[] args) {
    
    // # of pairs of socks
    int nSocks = 3; 
    // cost per pair of socks where $ is part of the name
    double sockCost$ = 2.58;
    // # of drinking glasses
    int nGlasses = 6;
    // cost per glass
    double glassCost$ = 2.29;
    // # of envelopes
    int nEnvelopes = 1; 
    // cost per box of envelopes
    double envelopeCost$ = 3.25;
    double taxPercent = 0.06;
    
    // declare variables for the total costs of socks, glasses, and envelopes WITHOUT taxes
    double tSockCost, tGlassCost, tEnvelopeCost;

    // item being bought
    // how many of item are being bought
    // cost per item
    // total cost for the items
    // sales tax for the total cost of the items
    // total cost of purchases before tax
    // total sales tax on everything
    // total cost of purchases with the tax
    
    System.out.println("Socks");
    System.out.println("Number of pairs of socks being bought: "+nSocks+"");
    System.out.println("Cost per item: "+sockCost$+"");
    tSockCost = nSocks*sockCost$;
    System.out.println("Total cost for the socks before tax: "+tSockCost+"");
    double itemSalesTaxS;
    itemSalesTaxS = tSockCost*taxPercent*100;
    int intItemSalesTaxS = (int) itemSalesTaxS;
    itemSalesTaxS = (double) intItemSalesTaxS;
    itemSalesTaxS/= 100;
    System.out.println("The tax on the item: "+itemSalesTaxS+"");
    
    System.out.println("Glasses");
    System.out.println("Number of pairs of socks being bought: "+nGlasses+"");
    System.out.println("Cost per item: "+glassCost$+"");
    tGlassCost = nGlasses*glassCost$;
    System.out.println("Total cost for the glasses before tax: "+tGlassCost+"");
    double itemSalesTaxG = tGlassCost*taxPercent*100;
    int intItemSalesTaxG = (int) itemSalesTaxG;
    itemSalesTaxG = (double) intItemSalesTaxG;
    itemSalesTaxG/= 100;
    System.out.println("The tax on the item: "+itemSalesTaxG+"");
    
    System.out.println("Envelopes");
    System.out.println("Number of pairs of socks being bought: "+nEnvelopes+"");
    System.out.println("Cost per item: "+envelopeCost$+"");
    tEnvelopeCost = nEnvelopes*envelopeCost$;
    System.out.println("Total cost for the glasses before tax: "+tEnvelopeCost+"");
    double itemSalesTaxE = tEnvelopeCost*taxPercent*100;
    int intItemSalesTaxE = (int) itemSalesTaxE;
    itemSalesTaxE = (double) intItemSalesTaxE;
    itemSalesTaxE/= 100;
    System.out.println("The tax on the item: "+itemSalesTaxE+"");
    
    double totalCost;
    totalCost = tSockCost+tGlassCost+tEnvelopeCost;
    System.out.println("The total cost of all items before tax is: "+totalCost+"");
    double totalTax = totalCost*taxPercent*100;
    int intTotalTax = (int) (totalTax);
    totalTax = (double) intTotalTax;
    totalTax/= 100;
    System.out.println("The total amount of sales tax is: "+totalTax+"");
    double costOfPurchases = (totalCost+totalTax)*100;
    int intCostOfPurchases = (int) costOfPurchases;
    costOfPurchases = (double) intCostOfPurchases;
    costOfPurchases/= 100;
    System.out.println("Total cost of purchases with tax is: "+costOfPurchases+"");
    
    }
}


