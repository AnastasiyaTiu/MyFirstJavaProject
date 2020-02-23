package Day22;

public class LoopControlStatement {
    public static void main(String[] args) {

        /*
        Store this sentence in a variable msg
I struggle with Java I Like Java I love Java Everything is Awesome!
loop through each and every letter
1, print every other letter
 meaning : skip a letter each time you go through the letter
	0123456789
	I struggle with  -->> Isrgl ih
	USE CONTINUE FOR THIS TASK
2,  when you reach letter a break the loop
OPTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitive
         */
    String msg = "I struggle with Java I like Java I love Java Everything is Awesome!";
        int msgLength = msg.length();
        System.out.println("Character Count = " + msgLength);

        //  for (int idx = 0; idx <= msgLength-1; idx++) {
        for (int idx = 0; idx < msgLength; idx++) {
            if (idx % 2 == 1){
                continue;
            }
            System.out.println(idx + "  :  " + msg.substring(idx, idx+1));
        }

//        // Task 2
//        for (int idx = 0; idx < msgLength; idx++) {
//         // this is the code to skip the odd number
//            if (idx % 2 ==1){
//                continue;
//            }
//            String currentChar = msg.substring(idx, idx+1);
//
//            if(currentChar.equalsIgnoreCase("J")){
//                break;
//            }
//            System.out.println(idx + " index " + " : currentChar = " + currentChar);
//        }

    }
}
