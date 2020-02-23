package Day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {
        //int[] nums = {13, 31, 8, 5, 21, 2};
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("nums = " + Arrays.toString(nums));

        // create the variable called isSortedAlready and assign value of true
        // I assume the array is already sorted and if it's not then
        // I change the value of isSortedAlready to False
        boolean isSortedAlready = true;

        for (int x = 0; x < nums.length-1 ; x++) {
            System.out.println(nums[x] + " " + nums[x+1]);
            // pick first item and compare with second item
            // keep repeating until there is no more item

            // print is item1 is less than item2
            System.out.println(" is " + nums[x] + " less than "+ nums[x+1] + " ? "
                    + (nums[x] < nums[x+1]) );

            if(!(nums[x] < nums[x+1])){
                System.out.println("Array is not sorted, No point checking the rest");
                isSortedAlready = false;
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);
    }
}
