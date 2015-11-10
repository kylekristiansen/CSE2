/////////////////////////////////////////////////////////////////////////////////
/* kyle kristiansen
10/11/2015
hw07 - Twisty

program:
    prompt user for LENGTH and WIDTH 
    length is how many characters horizontally
    width is how many characters vertically 
    input should look like a twisting zig zag


*/
import java.util.Scanner;

public class testing {
    
    
    public static void main(String[] args) {
        
        /*Scanner s = new Scanner (System.in);
        double num = 0.0;
        double works = 1.0;
        
        num = Scan(works);
        
        System.out.println("works: " +num);
        
        boolean what = true;
        String camp = "camp5";
        boolean place;
        //place = Character.isLetter('a');
        what = Character.isLetter(camp.charAt(4));
        //System.out.println("does this work? boolean: " +place);
        System.out.println("does this work? boolean: " +what);
        */
        
        int x = 10;
        
        /*do { 
            x+=5;
            System.out.println(x);
        } while (x<10);
        
        for (x=10; x<=10; x++) {
            x+=5;
            System.out.println(x);
        }
        
        
        int i = 0;
        for (i=0; i<10; i++)
            System.out.println(i+4);
            
        }
        
        
        int k = (new Scanner (System.in)).nextInt();
        for (int i = 2; i<k; i++) {
            System.out.println("i :"+i);
        }
        
        
       
       for (int i=2; i<5; i++) {
           for (int j = 0; j<i; j++) {
               for(int k = 0; k<j+1; k++) {
                   System.out.print("b");
               }
               System.out.println("");
           }
           
       }
       
       
       int i = 6;
       int j = 0;
       int k = 0;
       int m = 0;
       int z = 2;
       
       for ( ; i>0; i--) {
           for (j=0;     j < i-2      ; j++) {
                for (k = 0;   k < i - z     ; k++) {
                    System.out.print(i);
                }
                z++;
                System.out.println("");
           }
           z = 2;
       }
       m = 2;
       int n = 0;
       
       while (n<2) {
           System.out.println(2-n);
           n++;
       }
       
       
       int i = 0;
       int j = 0;
       int k = 0;
       
       for (i=0; i<3; i++) {
           
           for (j=0; j<i+2; j++) {
               
               for (k=0; k<j+1; k++) {
                   
                   System.out.print("b");
                   
               }
               
               System.out.println("");
           }
       }
       
       
       System.out.println("[START]");
       for (int i=30; i>1; i-=5) {
           System.out.println("[" +(i+1)+ "]");
       }
       System.out.println("[END]");
       */
       
       int num = 10;
       int i = 0;
       int j = 0;
       int k = 0;
       
       for (i=0; i<num; i++) {
           for (j=0; j<num; j++) {
               if (j == i) {
                    System.out.print("\\");
                }
               if (j>i) {
                   System.out.print("+");
                   
               }
               if (j<i) {
                   System.out.print("o");
                  
               }
               
            }
            System.out.println("");
       }
       
       
       
       
    }
    
    
}