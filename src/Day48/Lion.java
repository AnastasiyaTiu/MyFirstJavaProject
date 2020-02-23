package Day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals {

    public static void main(String[] args) {

//        Lion l1 = new Lion();
//        l1.drinkMilk();
//        l1.makeNoises();

        // any class you created, it can be a data type for a variable
        // also known as reference variable

        Animal a1 = new Lion();
        a1.makeNoises();

        List<Integer> lst = new ArrayList<>();
    }
    @Override
    public void drinkMilk() {
        System.out.println("Lion drink Milk");
    }

    @Override
    public void makeNoises() {
        System.out.println("Lion say ROARRRRRRRRRR!!!");
    }
    // public abstract void makeNoises();
    // public abstract void drinkMilk();

}


