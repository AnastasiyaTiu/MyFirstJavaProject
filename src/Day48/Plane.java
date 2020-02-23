package Day48;

// we build relationship between class and interface
// using implements keyword
// (compared to extends keyword for class to class)
// it will build a IS_A Relationship | Inheritance
// we can say Plane IS_A Flyable
// since we are inheriting an abstract method
// we need to provide body by overriding it
public class Plane implements Flyable{

    int capacity;
    int speed;
    String name;

    @Override
    public void fly(){
        System.out.println("Plane is flying");
    }
    // bad idea but just for demo purpose
    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.fly();
        // anything static, we can access in static way
        // including the static field of interface
        System.out.println(Flyable.HAVE_WING);
        // if we have static field in this class
        // Can we access them in static method main directly
        System.out.println(HAVE_WING);
    }
}
