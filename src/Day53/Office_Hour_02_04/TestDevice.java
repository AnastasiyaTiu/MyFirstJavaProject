package Day53.Office_Hour_02_04;

public class TestDevice {
    // device --> Samsung --> Waterproof
    //             Iphone
    public static void main(String[] args) {
        // reference: d, s, i
        // objects: new Device(), new Samsung(), new Iphone()

        // Device d = new Device();

        // What is polymorphism?
        // reference(d2)
        // reference type decides

        Device d2 = new Samsung();
        // d2 does not have access any variable or method which
        // created in Samsung
        d2.price = 899;
        d2.size = 6;
        // d2.color;
        // d2.takePicture()

        WaterProof w = new Samsung();
        // w does not have access for any variable or methods
        // in Device or Samsung

        System.out.println("d3 ===");
        // d3' type is device == d3 can HAVE ACCESS ONLY variable + method
        Device d3 = new Iphone();
        d3.size = 8;
        d3.price = 375;
        d3.call(); // this method will be called from Device
        // d3.call(); --> after you have call() in Iphone class, it calls
        // you can not use anything from Iphone

        System.out.println("i2 ====");
        Iphone i2 = new Iphone();
        i2.price = 1000;
        i2.size = 5 ;
        i2.platform = "IOS";
        i2.call(); // after write call() in Iphone class, this method will be called

        Samsung s = new Samsung();
        s.price = 999;
        s.size = 7;
        s.color = "Black";

        s.call();
        s.sendMessage();

        System.out.println("========================");
        Iphone i = new Iphone();
        i.call();
        i.sendMessage();
        }
}
