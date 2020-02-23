package Day20;

public class FindDogInSentence {
    public static void main(String[] args) {
       // find out the location of the dog
        // our approach is going though the sentence 3 character at a time
        // then if 3 characters happen to be a dog, we print out the index
                   // 01234567890123456789012345678901234567890123
        String msg = "I like Dog, Dogs are cute, Dogs are friendly";
        int lastCharIndex = msg.length()-1;

        for (int i = 0; i <= lastCharIndex - 2; i++) {
            String current3Chars = msg.substring(i,i+3);
            System.out.println(i + " : " + current3Chars );

            if (current3Chars.equals("Dog")){
                System.out.println("BINGO!!! AT " + i);
            }
        }
    }
}
