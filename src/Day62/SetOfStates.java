package Day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfStates {
    public static void main(String[] args) {
        // Create a Set of String called States
        // add bunch of states with some duplicate
        // iterate over them using each and every way you know

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("California", "Florida", "Nedava", "California", "California", "Arizona", "Texas"));

        //any type of collection has size method to count the item
        System.out.println("How many states? - " + states.size());

//        for(String each : states){
//            System.out.println("each = " + each);
//        }

        //FOR LOOP DOES NOT WORK!!! NO INDEX!!!!
        // We can use iterator for any type of collection at all time

        // creating iterator
//        Iterator<String> strIter = states.iterator();
//
//        while(strIter.hasNext()   ){
//            System.out.println("strIter.next() = " + strIter.next());
//        }

        states.forEach(each -> System.out.println("each state = " + each));


    }
}
