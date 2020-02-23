package Day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {
        // create an int array with size 100 and fill it up as below
        // fill up this array with even number starting from 0
        int[] numbers = new int [100];
        System.out.println("Before the filling up :\n " + Arrays.toString(numbers));
//   this what we do without the loop
//        numbers[0] = 0;
//        numbers[1] = 2;
//        numbers[2] = 4;
//        numbers[3] = 6;
//        numbers[4] = 8;
//        numbers[5] = 10;
//        //........
//        numbers[99] = 198;


        for (int x = 0; x < numbers.length; x++) {
             numbers[x] = x*2;
        }
// numbers[x] = x * 2;
        System.out.println("After filling up : \n " + Arrays.toString(numbers));
    }
}
