////////////////////////////////////////////////////////////////////////////////
// Kyle Kristiansen
// September 4, 2015
// lab02-Cyclometer
// cse2
//
// this assignment is about recording the info gathered by a bike cyclometer
// it will print 
//    number of min for each trip
//    number of counts for each trip
//    distance of each trip in miles
//    distance for the two trips combined
//
// will compile program
//    javac Cyclometer.java
// will run code
//    java Cyclometer//

//define a class
public class Cyclometer{

// define a method
    public static void main(String[] args) {
        
        int secsTrip1 = 480; // seconds for the first trip
        int secsTrip2 = 3220; // seconds for the second trip
        int countsTrip1 = 1561; // number of rotations for first trip
        int countsTrip2 = 9037; // number of rotations for trip 2
        
        double wheelDiameter = 27.0; // diameter of wheel, important for rotations
        double PI = 3.14159; // constant
        double feetPerMile = 5280; // constant
        double inchesPerFoot = 12; // constant
        double secondsPerMinute = 60; // constant
        double distanceTrip1, distanceTrip2, totalDistance; // naming the type for all 3 variables as double
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts."); // printing info gained from currrent variable
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts."); // printing info gained from current variables
        
        // compute the values for distance
        
        distanceTrip1 = countsTrip1*wheelDiameter*PI; // rotations times circumfrence, distance in inches
        distanceTrip1/= inchesPerFoot*feetPerMile; // i dont understand how this one gives the distance in miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI; // distance for trip 2 in inches
        distanceTrip2/= inchesPerFoot*feetPerMile; // still doesnt make sense 
        // /= means to divide the value on the left side of = with the function on the right side
        // line 45 means distanceTrip2/(inchesPerFoot*feetPerMile)
        totalDistance = distanceTrip1+distanceTrip2;
        
        System.out.println("the distance for trip 1 is "+distanceTrip1+" miles");
        System.out.println("the distance for trip 2 is "+distanceTrip2+" miles");
        System.out.println("the total distance of both trips is "+totalDistance+" miles"); 
        
    }
    
}