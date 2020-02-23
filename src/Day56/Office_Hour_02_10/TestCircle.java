package Day56.Office_Hour_02_10;

class Circle{
    public double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    @Override
    public boolean equals(Object O){

      //  Object O1 = new Circle(3.4);
      //  Object O2 = new String();
        if( O instanceof Circle )  // checks if O is Circles object or not
            if(radius == (  (Circle)O).radius )   // check if two Circles have same radius
              return true;

        return false;
    }
        }

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(4.0);
        Object c3 = new String ();
        System.out.println("c1.equals(c2) = " + c1.equals(c2)); // true
        System.out.println("c2.equals(c3) = " + c2.equals(c3));

       // new Object().equals()

        Circle c4 = new Circle(7.0);
        Circle c5 = new Circle(8.0);

        System.out.println("c4.equals(c5) = " + c4.equals(c5));  // false

    }
}
