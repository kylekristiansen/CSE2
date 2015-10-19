//////////////////////////////////////////////////////////////////////////////
/* Kyle Kristiansen
10-18-15
hw08 - Area.java

program:
    write program that can calculate the area of three diff shapes:
        RECTANGLE, TRIANGLE, CIRCLE
    user inputs shape,
    depending on the shape, user inputs proper dimensions
    
    if invalid shape entered, say so and prompt again
        use .equals() for string equivalency 
    should be 4 methods besides the main, one for each shape and one to check the input
    
    methods should get you area of each shape

*/

import java.util.Scanner;

public class Area {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        System.out.print("input one of the following shapes, rectangle, triangle, or circle: ");
        String input = "";
        String rectangle = "rectangle";
        String triangle = "triangle";
        String circle = "circle";
        int i = 0; 
        
        while (i == 0) {
            if (s.hasNextLine()) {    
                input = s.nextLine();
                if (input.equals(rectangle)) {
                    i++; continue;
                }
                else if(input.equals(triangle)) {
                    i++; continue;
                }
                else if (input.equals(circle)) {
                    i++; continue;
                }
                else {
                    System.out.print("input not valid, enter either rectangle, triangle, or circle: ");
                    i--;
                }
            }
            else if (!s.hasNextLine()) {
                System.out.print("input not valid, enter either rectangle, triangle, or circle: ");
                s.next();
                i--;
            }
            i++;
        }
        
        double width = 0.0;
        double height = 0.0;
        double radius = 0.0;
        double area = 0.0;
        boolean check;
        boolean invalid = false;
        
        if (input.equals(rectangle)) {
            System.out.print("input double value for width: ");
            for (i=0; i==0; i++) {
                if (s.hasNextDouble()) {
                    width = s.nextDouble();
                    check = checkInput(width);
                    while (check == invalid) {
                        System.out.print("invalid input for width, enter double value: ");
                        width = s.nextDouble();
                        check = checkInput(width);
                    }
                }
                else {
                    System.out.print("invalid input for width, enter double value: ");
                    s.next();
                    i--;
            }   }
            System.out.print("input double value for height: ");
            for (i=0; i==0; i++) {
                if (s.hasNextDouble()) {
                    height = s.nextDouble();
                    check = checkInput(height);
                    while (check == invalid) {
                        System.out.print("invalid input for height, enter double value: ");
                        height = s.nextDouble();
                        check = checkInput(height);
                }   }
                else {
                    System.out.print("invalid input for height, enter double value: ");
                    s.next();
                    i--;
            }   }
        
            area = rectangle(width, height);
            print(area);
            return;
        }
        
        if (input.equals(triangle)) {
            System.out.print("input double value for width: ");
            for (i=0; i==0; i++) {
                if (s.hasNextDouble()) {
                    width = s.nextDouble();
                    check = checkInput(width);
                    while (check == invalid) {
                        System.out.print("invalid input for width, enter double value: ");
                        width = s.nextDouble();
                        check = checkInput(width);
                    }
                }
                else {
                    System.out.print("invalid input for width, enter double value: ");
                    s.next();
                    i--;
            }   }
            System.out.print("input double value for height: ");
            for (i=0; i==0; i++) {
                if (s.hasNextDouble()) {
                    height = s.nextDouble();
                    check = checkInput(height);
                    while (check == invalid) {
                        System.out.print("invalid input for height, enter double value: ");
                        height = s.nextDouble();
                        check = checkInput(height);
                }   }
                else {
                    System.out.print("invalid input for height, enter double value: ");
                    s.next();
                    i--;
            }   }
            
            area = triangle(width, height);
            print(area);
            return;
        
        }

        if (input.equals(circle)) {
            System.out.print("input double value for radius: ");
            for (i=0; i==0; i++) {
                if (s.hasNextDouble()) {
                    radius = s.nextDouble();
                    check = checkInput(radius);
                    while (check == invalid) {
                        System.out.print("invalid input for radius, enter double value: ");
                        radius = s.nextDouble();
                        check = checkInput(radius);
                }   }
                else {
                    System.out.print("invalid input for radius, enter double value: ");
                    s.next();
                    i--;
        }   }
        
            area = circle(radius);
            area = (int) (area*100);
            area = (double) area / 100;
            print(area);
            return;
        }
    }
    
    public static double rectangle(double width, double height) {
        double Area = width*height;
        return Area;
    }
    public static double triangle(double width, double height) {
        double Area = (width*height)/2;
        return Area;
    }
    public static double circle(double radius) {
        double pi = 3.14159265359;
        double Area = pi*(Math.pow(radius, 2));
        return Area;
    }
    public static boolean checkInput(double dimension) {
        if (dimension >= 0.000001) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void print(double area) {
        System.out.println("Area: " +area);
    }
}