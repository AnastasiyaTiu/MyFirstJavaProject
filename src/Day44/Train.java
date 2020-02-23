package Day44;

public class Train extends Vehicle {
    int wagonCount;
    public void makeChoChoSound(){
        System.out.println("CHOOOO CHOOOO");
    }

    public static void main(String[] args) {
        Train t1 = new Train();
        t1.makeChoChoSound();
        // this attribute we got from Vehicle
        t1.make = "Thomas";
        t1.setYear(1999);
        System.out.println("t1.getYear() = " + t1.getYear());
        // calling the method we got from vehicle
        t1.start();
        t1.goForward();




}
}
