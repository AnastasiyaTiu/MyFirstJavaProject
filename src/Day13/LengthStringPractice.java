package Day13;

public class LengthStringPractice {
    public static void main(String[] args) {
      //  String name= "Ankar";
      //  System.out.println(name);

        String name="Pumkin";
        System.out.println( name );
    //  STRING is IMMUTABLE, once created it can not be changed
        //any String actions/methods that looks like changing the variable
        //actually creating ______________________________
        name.toUpperCase();
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // what if I really want to change the name

        name=name.toUpperCase();
        System.out.println(name);
    }
}
