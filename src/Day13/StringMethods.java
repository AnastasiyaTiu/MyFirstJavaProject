package Day13;

public class StringMethods {
    public static void main(String[] args) {
        // String actions that we already know so far
        //  equals
        String s1 = "hello";
        System.out.println(  s1.equals("abc")  );
        // equalsIgnoreCase
        System.out.println(  s1.equalsIgnoreCase("HELLO")  );

        // toUpperCase method of String is used to make String all character uppercase

        System.out.println(   s1     );
        System.out.println( s1.toUpperCase());  //---> () generating the result Hello

        // toLowerCase method od String is used to
        //make String all character lowercase

        System.out.println(   s1.toLowerCase()    );

    }

}
