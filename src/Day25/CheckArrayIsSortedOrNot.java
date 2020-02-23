package Day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] nums = {13, 31, 8, 5, 21, 2};
        System.out.println("nums = " + Arrays.toString(nums));

        // storing the size of an array into a variable
        int numsItemCount = nums.length;
        //I want to copy the content of nums array into the new array

        // creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];
     // coping the value of one array into the new array
        for (int x = 0; x < numsItemCount; x++) {
            numsCopy[x] = nums[x];   // this line is coping nums array items into numsCopy array one by one
        }
        System.out.println("numsCopy = " + Arrays.toString(numsCopy));

        System.out.println("Before sort numsCopy " + Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy " + Arrays.toString(numsCopy));

        // Check whether the array still have same content in same order after sorting
        // what method will check for content
        if (Arrays.equals(nums, numsCopy)) {
            System.out.println("This array is already sorted");
        } else {
            System.out.println("This array is not sorted");
        }

        // Plain English logic to see a 7 number is sorted or not
        // you copy this 7 numbers in another container
        // sort the number and check whether it still has same original as original number
        // why did we copy? because if we
    }
}
