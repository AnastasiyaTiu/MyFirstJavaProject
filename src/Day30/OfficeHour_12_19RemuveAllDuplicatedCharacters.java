package Day30;

import java.util.Arrays;

public class OfficeHour_12_19RemuveAllDuplicatedCharacters {
    public static void main(String[] args) {
        //2. Write a program that will remove all the duplicates from a string
        //Do it with Arrays only
        String s1 = "aaabbaaccbbdd";
        // expected result: abcd
        String s2 = "";
        // we store non duplicated characters in it
          // s2 = "ab"
        for (int i = 0; i < s1.length(); i++) {
            String eachChar = "" + s1.charAt(i); //a
            if (!s2.contains(eachChar)) {
                s2 += eachChar;
                //we only concat the character if that character is not exist in s2
                // s2: "a"
            }
        }
        System.out.println(s2);

        ////// SOLUTION 2
        String fiveMinutes = "abcabcdeeeddddeeeeffffjjj";
        String[] eachChar = fiveMinutes.split("");
        String result = ""; // to store all non duplicated String objects of the array
        for (String each: eachChar) {
            if( !result.contains(each) ){
                result += each;
            }
        }
        System.out.println(result);

    }
}
