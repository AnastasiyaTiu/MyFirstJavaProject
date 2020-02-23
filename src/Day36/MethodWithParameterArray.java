package Day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
        int[] nums ={1,5,3,4,7,2};
//        System.out.println("Before sort nums = " + Arrays.toString(nums));
//        Arrays.sort(nums);
//        System.out.println("After sort nums = " + Arrays.toString(nums) );

        System.out.println("Before change nums = " + Arrays.toString(nums));
        changeArrayFirstItemTo100(nums);
        System.out.println("After change nums = " + Arrays.toString(nums) );
    // when you pass a variable to a method parameter:
        // you are only passing the copy of that variable
        // for primitives -->> the copy hold the value that passed
        // changing the value does not change original value that passed

        // for reference type -->> the copy hold the same address of the object
        //changing the value will affect original object
       // because both methods parameters
        //
        //


    }
// this is what happen when you pass nums to this method
//    public static void changeArrayFirstItemTo100(int[] numbers ){
//   numbers variables are copying whatever is inside nums
//    What is inside nums variable??  THE ADDRESS OR ARRAY OBJECT
    // so now numbers has same address of the object as nums
//        int[] numbers = nums;
//        numbers[0] = 100;
//    }


    /*
    @param numbers
     */
    public static void changeArrayFirstItemTo100(int[] numbers ){
        numbers[0] = 100;
    }
}
