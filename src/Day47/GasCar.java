package Day47;
// Create another sub class of Car called GasCar
// add a field called gasLevel
// implements all the abstract method of Car class

// Create gasCar object here
// call all the methods to test

// THIS IS CALLED CONCRETE CLASS
// concrete car must provide body for all inherited abstract method
// or it will not even compile
public class GasCar extends Car {
    int gasLevel;

    // implementing an abstract method in sub class means
    // providing body for the method in sub class
    @Override
    public void start() {
        System.out.println("Gas Car is starting");
    }

    @Override
    public void goForward() {
        System.out.println("Gas Car is going Forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas Car is going Backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas Car is Turning " + direction);
    }
}
