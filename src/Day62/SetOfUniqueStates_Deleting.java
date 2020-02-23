package Day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);

        // The Lambda expression way of removing
        states.removeIf( each -> each.contains("A") );
        System.out.println("states = " + states);

        // remove All the states with letter A
        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection

        while(stIter.hasNext() ){

            // PLEASE DO NOT CALL NEXT METHOD TWICE IN ONE ITERATION OR IT WILL SKIP TO NEXT ITEM
          //  String each = stIter.next();
            if(stIter.next().contains("A")  ){
               // System.out.println("removing = " + each );
                stIter.remove();
            }
        }
        System.out.println("states after = " + states);

        System.out.println();
        // IF ANY TRY TO GET THE NEXT ITEM THAT YOU DO NOT HAVE USING ITERATOR
        // YOU WILL GET NoSuchElementException
        System.out.println();
    }
}
