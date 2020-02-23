package Day47;
// I don't need to create car object using this class
// I only want this class to be super class to provide
// reusable fields and methods for sub class
// this class is designed to be a super class
public abstract class Car {

int year;
String brand;

// abstract class can have abstract method
    // it has abstract keyword
    // and it does not have body, DOES NOT HAVE {}
    // it ends with ;
    // it is meant to be OVERRIDDEN to provide body
    // in sub class
public abstract void start();
     // add abstract void methods:
    // goBackward
   // goForward
  // turn(String direction)
public abstract void goForward();

public abstract void goBackward();

public abstract void turn(String direction);

public void doCarThing(){
    System.out.println("non abstract method can be in a abstract class");
}

public static void doStaticThing(){
    System.out.println("static method can be in a abstract class");
}
}
