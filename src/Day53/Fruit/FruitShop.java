package Day53.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {
    // only Reference type Decide what you can access at compile time
    // if we have fruit as reference type, getDigested method will point ti the one under Fruit class
    // Actual object type decide what method will called at run time
    // since actual object is Apple|Orange, at run time it will call overridden version of the method
    // and that's the power of polymorphism, making the correct decision at runtime according to the actual object

    public static void main(String[] args) {
        Apple a1 = new Apple("sweet", "red", "Fuji");

        // what can I access using reference variable a1
        // a1 has Apple as reference type, so we can access anything inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigested();

        System.out.println("//----------------------------");
        Fruit f1 = a1; // new Apple ("sweet", "red", "Fuji");
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        //f1.type // we can not access type coming from apple if we refer it as Fruit
        // if fruit does not have getDigested Method
        // below will not compile
        // because only reference type decide what you can access
        f1.getDigested(); // new Apple("sweet", "red", "Fuji").getDigested()
        f1 = new Orange("sour-sweet", "redish", 11);
        f1.getDigested();

        System.out.println(f1.toString());

        //String str = null;
        //System.out.println(str.charAt(0));
        //System.out.println(str.getDigested() );

       // Fruit is a reference type, Apple is actual object Type
        Fruit f2 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "Blood Red", 10);

        Fruit[] myFruits = {f1, f2, f3, f4};
        for(Fruit each : myFruits){
            each.getDigested();
        }

    }
}
