package Day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {
        /*
        01234567890
 String abc = "hello world"  ;   x <= charCount-n
I want to get 4 characters at a time
	WHAT IS MY CONDITION     x <= 11-4 = 7
         */

        String msg = "Hello World";

        int charCount = msg.length();

        int countOfCharToIterate = 2;
        int n = 7;
        //x <= charCount-n

        for (int i = 0; i <= charCount -n; i++) {
            System.out.println(msg.substring(i, i + n)   );
        }


    }
}
