package Day62;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {

        // If you want to keep insertion order( first come first serve )
        // and it also remove duplicate
        // It's sub class of HashSet

        Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums LinkedHashSet = " + myNums);

        Set<Integer> myNums2 = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums2 HashSet = " + myNums2);
    }
}
