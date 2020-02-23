package Day49;
/*
Create a concrete class called Tesla
 add instance field horsePower as int
 Tesla extends Vehicle and implements Autonomous
 add constructor to set all fields
 implement all abstract methods
 add toString methods
 create main method to test your code
 */
public class Tesla extends Vehicle implements Autonomous, Chargeable{
    public int horsePower;
    public String model;

    public Tesla(int year, int horsePower, String model ) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void start(){
        System.out.println(model + " with " + horsePower + " is starting with voice command ");
    }

    @Override
    public  void selfDrive(){
        System.out.println(model + " with " + horsePower + " has self drive option ");
    }

//    @Override
//    public void charge(){
//        System.out.println("Tesla is chargeable car");
//    }
//public void goForward(){
//    System.out.println("Going forward ");
//}

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
