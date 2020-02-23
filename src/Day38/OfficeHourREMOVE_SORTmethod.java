package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OfficeHourREMOVE_SORTmethod {
    public static void main(String[] args) {

        /*
        Remove method
        remove(int index): removes the given index number

        remove(Object): removes the first matching object of the arrayList, returns boolean value

         */

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1) );
           Collections.sort(nums2);
        System.out.println("Sorted nums = " + nums2);
    }
}
