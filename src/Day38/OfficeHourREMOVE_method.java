package Day38;

import java.util.ArrayList;
import java.util.List;

public class OfficeHourREMOVE_method {
    public static void main(String[] args) {

        /*
        Remove method
        remove(int index): removes the given index number

        remove(Object): removes the first matching object of the arrayList, returns boolean value

         */
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        // [1, 2, 3]
       // int a1 = 1;
        Integer a2 = 1;

        //list3.remove(a1);  //[1,3]
        boolean r1 = list3.remove(a2);  //[2,3]

        System.out.println(list3);
        System.out.println(r1);   // true, because 1 was removed from the array list

        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("b");
        list4.add("C");
        list4.add("D");


       // [A, B, C, D]

        //  list4.remove(2);  // [A, B, D]
       list4.remove("B");  // [A, C, D]
        System.out.println(list4);

    }
}
