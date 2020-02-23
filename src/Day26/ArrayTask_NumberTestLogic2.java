package Day26;

public class ArrayTask_NumberTestLogic2 {
    public static void main(String[] args) {
        /*
         * // 1, given an int array
         *   write a program to test all the elementS in this int array are more that 100
         * */

        // LOGIC 2 :
        //Assume initial value for final result is Yes
        // Check each item and
        // break when number is less than 100
        // after assigning final result to NO
        // if we never go inside condition the final result will remain YES
    int[] scores = {156, 101, 76, 187, 87, 110};
    int size = scores.length;
        System.out.println("size = " + size);
        String finalResult = "YES";
    for (int eachNum : scores) {

        if (eachNum <= 100) {
            finalResult = "NO";
            break;
        }
    }
            System.out.println("finalResult = " + finalResult);


            // LOGIC 3 :
            // minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

            // LOGIC 4 :
            // find min number if min number more than 100 yes


        }
    }
