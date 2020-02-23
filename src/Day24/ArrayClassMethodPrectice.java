package Day24;

import java.util.Arrays;

public class ArrayClassMethodPrectice {
    public static void main(String[] args) {

        // create a double array of 3 items and put 3 value
        //get a string representation out of this array and save it as priceString
        //print each and every character in this String in this format
        // character at index 1 is : yourCharacterHere
        // character at index 2 is : yourCharacterHere and so on all the way till last

        double[] prices = {3.14, 5.5, 9.0 };
        System.out.println("Arrays.toString(prices) result : " + Arrays.toString(prices));

        //since the method give you back a string representation of array object
        //in this format [firstItem, secondItem, thirdItem ...... lastItem]
        //i can save it into String variable

        String pricesString = Arrays.toString(prices);
        System.out.println("priceString = " + pricesString);

        //we are looping over a String not an array so we after at last character finishes
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.println("character at index " + i + " is "
                    + pricesString.charAt(i));
              // the Sole Purpose of Arrays.toString(yourArray) is TO SEE what is Inside
        }




    }
}
