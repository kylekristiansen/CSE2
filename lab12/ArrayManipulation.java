/////////////////////////////////////////////////////////////////////////////////////
/*
Kyle Kristiansen
lab12 - array manipulation
11-13-2015

*/

import java.util.Scanner;
import java.util.Random;

public class ArrayManipulation {
    
    public static int[][] raggedArray(String randomVal) {
        Random r = new Random();
        int numOfMemArrays = r.nextInt(10) + 10;
        //int numOfIntsPerArray = r.nextInt(10) + 10;
        
        int[][] twoD = new int[numOfMemArrays][];
        
        for (int i = 0; i < twoD.length; i++) {
            twoD[i] = new int[r.nextInt(10) + 10];
            for (int k = 0; k < twoD[i].length; k++) {
                twoD[i][k] = r.nextInt(2000) - 1000;
            }
        }
        return twoD;
    }
    
    public static void printArray(int[][] twoD) {
        for (int i = 0; i < twoD.length; i++) {
            for (int k = 0; k < twoD[i].length; k++) {
                System.out.print(twoD[i][k] + "  ");
            }
            System.out.println();
            System.out.println();
        }
        
    }
    
    public static void printArray(int[] oneD) {
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + "  ");
        }
    }
    
    public static int[] findSmallest(int[][] twoD) {
        int[] minArray = twoD[0];
        for (int i = 1; i < twoD.length; i++) {
            if (twoD[i].length < minArray.length) {
                minArray = twoD[i];
            }
        }
        return minArray;
    }
    
    public static void findLargest(int[][] twoD) {
        //int[] maxArray = twoD[0];
        int maxMemMem = -10000000;
        int [] maxMemMemArray = new int[twoD.length];
        int num = 0;
        for (int i = 0; i < twoD.length; i++) {
            maxMemMem = twoD[i][0];
            for (int j = 1; j < twoD[i].length; j++) {
                if (twoD[i][j] > maxMemMem) {
                maxMemMem = twoD[i][j];
                }
            }
            maxMemMemArray[i] = maxMemMem;
        }
        num = maxMemMemArray[0];
        int index = 0;
        for (int k = 1; k < maxMemMemArray.length; k++) {
            if (maxMemMemArray[k] > num) {
                num = maxMemMemArray[k];
                index = k;
                
            }
        }
        
        System.out.println("the largest member of a member array is: ");
        System.out.println(num);
        System.out.println("this member comes from the member array: ");
        for (int m = 0; m < twoD[index].length; m++) {
             System.out.print(twoD[index][m] + "  ");
        }
        //return num;
    }
    
    public static int memArray(int[][] twoD) {
        int[] maxArray = twoD[0];
        int memArrayNum = 0;
        for (int i = 1; i < twoD.length; i++) {
            if (twoD[i].length > maxArray.length) {
                maxArray = twoD[i];
                memArrayNum = i;
            }
        }
        return memArrayNum;
    }
    
    public static int[] mostEven(int[][] twoD) {
        int[] mostEven = new int[0];
        int counter = 0;
        int placeHolder = 0;
        for (int i = 0; i < twoD.length; i++) {
            counter = 0;
            for (int j = 0; j < twoD[i].length; j++) {
                if (twoD[i][j]%2 == 0) {
                    counter++;
                }
            }
            if (counter > placeHolder) {
                placeHolder = counter;
                mostEven = twoD[i];
            }
        }
        return mostEven;
    }
   
    public static void main(String[] args) {
        
        String randomVal = "irrelevant";
        
        int[][] twoD = raggedArray(randomVal);
        
        printArray(twoD);
        
        System.out.println("the shortest member array: ");
        int[] minArray = findSmallest(twoD);
        printArray(minArray);
        System.out.println();
        
        
        
        findLargest(twoD);
        System.out.println();
        //printArray(maxArray);
        //System.out.print(maxMem);
        //System.out.println();
        // what member array did this come from?
        //int memArrayNum = memArray(twoD);
        //System.out.println("this array came from member array number: " +memArrayNum);
        
        
        
        
        
        System.out.println("the member array with the most even numbers in it: ");
        int[] mostEven = mostEven(twoD);
        printArray(mostEven);
        System.out.println();
        
        
    }
    
    
    
}