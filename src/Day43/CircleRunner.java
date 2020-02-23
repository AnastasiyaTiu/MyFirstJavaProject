package Day43;

public class CircleRunner {
    public static void main(String[] args) {
        /*
       * If you want all the instance of a class to share data,
        use static variables, also known as class variables.
        * Static variables store values for the variables in a
        common memory location.
        Because of this common location , if one object changes
        the value of a static variable, all objects of the same class are affected.
         */

        Circle c1 = new Circle();
        c1.setRatio(5);
        c1.setPi(10);
        System.out.println(c1.areaOfCircle() );

        Circle c2 = new Circle();
        c2.setRatio(5);
        System.out.println(c1.areaOfCircle() );

        Circle c3 = new Circle();
        c2.setRatio(5);
        System.out.println(c1.areaOfCircle() );



    }
}
