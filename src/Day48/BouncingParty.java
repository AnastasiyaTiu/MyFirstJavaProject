package Day48;

import java.util.ArrayList;
import java.util.List;

public class BouncingParty {
    public static void main(String[] args) {

        Ball b1 = new Ball("Round", "Blue");
        System.out.println("b1 = " + b1);
        b1.bounce();

        Kangaroo k1 = new Kangaroo("Coco", 10);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();
        k1.box();
        k1.carryChildInThePocket();

        // SuperType variableName = new SubType(...); THIS WORKS
       // List<Integer> lst = new ArrayList<>();
        Bouncible a1 = new Kangaroo("Toto", 6) ;
        a1.bounce();

        System.out.println(Bouncible.GRAVITY);
    }
}
