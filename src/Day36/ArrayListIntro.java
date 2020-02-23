package Day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        // How do we create an ArrayList Object

        ArrayList<String> lst1 = new ArrayList<>();
        //IT WILL ONLY STORE OBJECT!!! NOT PRIMITIVE
        //ArrayList<int> lst2 = new ArrayList<>();

        // Correct way to create arrayList object that store whole number
        // is to use Wrapper class type . Primitive types is FORBIDDEN!!!

        ArrayList<Integer> lst2 = new ArrayList<>(); // new ArrayList<Integer>()

        ArrayList<Long> lst3 = new ArrayList<>(); // new ArrayList<Long>()

        ArrayList<Double> lst4 = new ArrayList<>(); // new ArrayList<Double>()
   // OPTIONALLY YOU CAN CREATE IN THIS WAY

        // list is more general data type compared to ArrayList is more concrete data type
        //ArrayList is one type of List
        //Just like Dog is one of Animal

        List<String> myList = new ArrayList<>();
    }
}
