package Day39;

public class Garage2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Lexus" ;
        c1.make = "RX";
        c1.color = "Black" ;
        c1.year = 2020;
       c1.goForward();
       c1.printCarAge();
       c1.changeColorTo("Blue");
        System.out.println("Car 1 color = " + c1.color);
        System.out.println("--------------");

        Car c2 = new Car();
        c2.model = "Mercedes" ;
        c2.make = "530";
        c2.color = "White" ;
        c2.year = 2019;
        c2.goForward();
        c2.printCarAge();
        System.out.println("End ");
    }
}
