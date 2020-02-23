package Day42;

public class MovieUtility {
    public static void main(String[] args) {

     Movie m1 = new Movie();
        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker", "Drama", 2.2 );
        Movie m3 = new Movie("Frozen2", "Family", 1.5);
        Movie m4 = new Movie("Pursuit of Happiness", "Drama", 2.0);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);


        // I want to get the name of m2 separately so I can do some stuff
        // I can not access the field directly because it's private
        // I need a getter method to access
        // System.out.println(m2.name);
        System.out.println(m2.getName() );
    }
}
