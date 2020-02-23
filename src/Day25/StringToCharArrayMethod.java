package Day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name = "Alesya";
      // how would you store each and every character
        // to an char array from above name
        // without using method we are about to learn

        char[] namesChars = new char[6];   //name.length()

        // nameChars[0] = name.CharAt(0);
        //nameChars[1] = name.CharAt(1);

        for (int x = 0; x < namesChars.length; x++) {
            // take each character of the name and fill the char array values
            namesChars[x] = name.charAt(x);
        }
        System.out.println("namesChars = "+ Arrays.toString(namesChars));

        char[] nameChars2 = name.toCharArray();
        System.out.println("nameChars2 = " + Arrays.toString(nameChars2));
    }


}
