package Day16;

public class SecondWordGreater {
    public static void main(String[] args) {
        //given a sentence
        //
        //get the second word

        //Steps
        // second word is between first space and last space

        // getting location of space remind me of indexOf
        //getting string inside another string by beginning and ending index
        //remind me of substring
        String sentence="You understand Java";
        String secondWord;
        int firstSpaceIndex=sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex=sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = "+lastSpaceIndex);
        System.out.println(sentence.substring(1+1,6));
        secondWord= sentence.substring(firstSpaceIndex+1 , lastSpaceIndex   );
        System.out.println("secondWord = "+secondWord);
        //how to get first word?
        // in plain English : first word is starting from first character till first space
        String firstWord = sentence.substring(0, firstSpaceIndex);
        //how do we print out a variable with value using shortcut: soutv then tab
        System.out.println("firstWord = " + firstWord);

        //how to get last word from any sentence
        // last word in a sentence means from last space till the rest
        String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord= "+lastWord);
    }
}
