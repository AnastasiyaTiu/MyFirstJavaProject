package Day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {

        // Split method has two version:
        // first split by some separator and get whatever the count of item we get from the result
        //second version: accept 2 external data,
        // one is the separator another is the limit of your array size
        // so if you have 5 word in a sentence if you split by space and put the limit for 2
        // then you will get an array with size 2 -->> { first word, the rest of the sentence}
        String sentence = "I love Java Java Java";

        String[] wordsArray1 = sentence.split(" ", 1);
        String[] wordsArray2 = sentence.split(" ", 2);
        String[] wordsArray3 = sentence.split(" ", 3);
        String[] wordsArray4 = sentence.split(" ", 4);
        String[] wordsArray5 = sentence.split(" ", 5);
        String[] wordsArray6 = sentence.split(" ", 6);

        System.out.println("WordsArray1 = "+ Arrays.toString(wordsArray1));
        System.out.println("wordsArray1 size  = " + wordsArray1.length );

        System.out.println("WordsArray2 = "+ Arrays.toString(wordsArray2));
        System.out.println("wordsArray2 size  = " + wordsArray2.length );

        System.out.println("WordsArray3 = "+ Arrays.toString(wordsArray3));
        System.out.println("wordsArray3 size  = " + wordsArray3.length );

        System.out.println("WordsArray4 = "+ Arrays.toString(wordsArray4));
        System.out.println("wordsArray4 size  = " + wordsArray4.length );

        System.out.println("WordsArray5 = "+ Arrays.toString(wordsArray5));
        System.out.println("wordsArray5 size  = " + wordsArray5.length );

        System.out.println("WordsArray6 = "+ Arrays.toString(wordsArray6));
        System.out.println("wordsArray6 size  = " + wordsArray6.length );
    }
}
