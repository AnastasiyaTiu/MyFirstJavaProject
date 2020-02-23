package Day47;

public class ElectricCar extends Car {

    int batteryLevel;

    @Override
    public void start(){
        System.out.println("This is how Electric Car start ");
    }

    @Override
    public void goForward() {
        System.out.println("Electric Car GOING FORWARD ");
    }

    @Override
    public void goBackward() {
        System.out.println("Electric Car GOING BACKWARD");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Electric Car TURNING " + direction);
    }


}
