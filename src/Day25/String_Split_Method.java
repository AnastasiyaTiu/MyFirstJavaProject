package Day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence = "I love Java";

        // What does it do?
        // split(bySomething) is a method of String that split string into multiple part
        //Do I need to provide extra data while calling the method?
        // Yes , we need to tell what do we use while splitting, in this example space
        //What do I get out of it?
        // We get out String Array
        String[] allWords = sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));

        System.out.println("How many word do I have in this sentence? : " + allWords.length  );

        // How do I get the last word of the sentence using this array I got from String

        System.out.println("Last word of the sentence is " + allWords[allWords.length-1]);

//         Are we limited to splint by space or we can split by anything ? ---> Anything!
        String sentence2 = "Everything is Awesome!!!";
        // split by letter e
        String[] splitBy_eArr = sentence2.split("e");
        System.out.println("splitBy_eArr = " + Arrays.toString(splitBy_eArr) );
// using for each loop to                  resulting Array
        for (String eachPieces  :  splitBy_eArr) {
            System.out.println("eachPieces = < " + eachPieces + " >");

        }
        // split this sentence by is and print out your result



}
}
