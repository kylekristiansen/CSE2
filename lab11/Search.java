///////////////////////////////////////////////////////////////////////////////////
/*
Kyle Kristiansen
lab11 - search
11/6/15

*/

import java.util.Scanner;

public class Search {
    
    public static int[] incVal(int[] array2) {
        int i = 0;
        array2[0] = (int) (Math.random()*101);
        for (i=1; i<array2.length; i++) {
            array2[i] = array2[i-1] + (int) (Math.random()*100);
        }
        return array2;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int[] array1 = new int[5000];
        int[] array2 = new int[5000];
        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random()*100001);
        }
        
        int max = 0;
        int min = 0;
        
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] > array1[max]) {
                max = j;
            }
        }
        System.out.println("the maximum of array1 is: " +array1[max]);
        
        for (int k = 0; k < array1.length; k++) {
            if (array1[k] < array1[min]) {
                min = k;
            }
        }
        System.out.println("the minimum of array1 is: " +array1[min]);
        
        array2 = incVal(array2);
        
        System.out.println("the maximum of array2 is: " +array2[4999]);
        System.out.println("the minimum of array2 is: " +array2[0]);
        
        System.out.print("enter an int >= 0: ");
        int key = 0;
        if (s.hasNextInt()) {
            key = s.nextInt();
        }
        else {
            return;
        }
        
        System.out.println(key);
        
        int spot = 0;
        int low = 0;
        int high = array2.length - 1;
        int mid = 0;
        
        while(high >= low) { 
            mid = (low + high) / 2;
            if (key < array2[mid]) {
                high = mid - 1;
            }
            else if (key == array2[mid]) {
                spot = mid;
                break;
            }
            else {
                low = mid + 1;
            }
        }
        if (high < low) {
            System.out.println("the key was not found");
            System.out.println("the number above the key is: " +array2[high+1]);
            System.out.println("the number below the key is: " +array2[low-1]);
        }
        else {
            System.out.println(key + " was found on the list at position " +array2[spot]);
        }
    
    }
}
