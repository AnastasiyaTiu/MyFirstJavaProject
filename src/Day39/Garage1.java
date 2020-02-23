package Day39;

public class Garage1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Lexus" ;
        c1.make = "RX";
        c1.color = "Black" ;
        c1.year = 2020;
        System.out.println("Car 1 model "+ c1.model);
        System.out.println("car 1.make " + c1.make);

        Car c2 = new Car();
        c2.model = "Mercedes" ;
        c2.make = "530";
        c2.color = "White" ;
        c2.year = 2019;
        System.out.println("Car 1 model "+ c2.model);
        System.out.println("car 1.color " + c2.color);

        c2.year = 2020;
        System.out.println("car 2 year " + c2.year);

        // I want to change the color of the Mercedes To color of Lexus
    c2.color = c1.color;
    }
}
