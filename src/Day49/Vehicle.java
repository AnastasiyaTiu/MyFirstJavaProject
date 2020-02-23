package Day49;
// Create an abstract class called Vehicle
//        it has 1 fields
//        year
//        add a constructor to set the field
//abstract method start() ;
//        non-abstract instance method
//        goForward
public abstract class Vehicle {
    int year;

    public Vehicle(int year){
    this.year = year;
    }

    public abstract void start();

    public void goForward(){
        System.out.println("Going forward ");
    }

}
