package day05;

public class VariablePractice {
    public static void main(String[] args) {
  // Task 2: you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of: You are driving 10 mph more than speed limit
        // speedLimit as int, currentSpeed as int, overTheLimit as int

        int speedLimit= 60;
        int currentSpeed= 80;
        int overTheLimit= currentSpeed-speedLimit;

        System.out.println("You are driving "+ overTheLimit + " mph more than speed limit ");
        System.out.println("I was driving "+ currentSpeed+" MPH and the speed limit was "+speedLimit+ " MPH, that means driving "+overTheLimit+" over the limit.");
    }

}
