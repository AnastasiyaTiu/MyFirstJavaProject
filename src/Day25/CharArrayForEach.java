package Day25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharArrayForEach {
    public static void main(String[] args) {
        // pick up your own name and turn in into char array
        // and use for each loop to loop over them

        String myName = "Anastasiya";
        // turn this into charArray using toCharArray() method of String

        //What does it do?
        // toCharArray() is a method of String that turn string into char array
         //Do I need to provide extra data while calling the method?
        // NO
        // What do I get out of it?
        // char array object that has
        char[] nameCharAr = myName.toCharArray();
        System.out.println("Before sorting nameCharAr = " +  Arrays.toString(nameCharAr));
//        for (char eachChar: nameCharAr) {
//            System.out.println("eachChar = " + eachChar);
//        }
       // now count how many a you have in your name

        int count = 0;
        for (char eachChar: nameCharAr){
            if (eachChar=='a'){
                ++count;
            }
        }
        System.out.println("count = " + count);

        // what if you want to sort all characters of your name
        // in alphabetical order?

        Arrays.sort(nameCharAr);
        System.out.println("After sorting nameCharAr  = " + Arrays.toString(nameCharAr));
    }
}
