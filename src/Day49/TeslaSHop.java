package Day49;

public class TeslaSHop {
    public static void main(String[] args) {
        Tesla c1 = new Tesla(2020, 460, "Cyber Truck" );
        c1.start();
        c1.selfDrive();
        c1.goForward();
        c1.charge();
        System.out.println("c1 = " + c1);


    }
}
