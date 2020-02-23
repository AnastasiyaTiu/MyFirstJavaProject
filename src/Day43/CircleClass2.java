package Day43;

public class CircleClass2 {

    static int i = 10;

    public static void main(String[] args) {
        int a = i;
        Circle c1 = new Circle();
        c1.test();
        c1 = null;
        Circle c2 = new Circle();
        c1=c2;
        c1.test();
    }

    /*
    An instance method can invoke an instance or static method, and access an instance or static
data field. A static method can invoke a static method and access a static data field. However,
a static method cannot invoke an instance method or access an instance data field, since static
methods and static data fields don’t belong to a particular object.
     */
}
