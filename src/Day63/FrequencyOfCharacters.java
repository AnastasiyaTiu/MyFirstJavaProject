package Day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


    String str = "AAABBBBBBACCRDDD";






    Map<Character, Integer> charFreq = new HashMap<>();
    for(int x = 0; x < str.length(); x++){
        char currentChar = str.charAt(x);

        if (!charFreq.containsKey(currentChar)) {
            // if we don't have the key yet, it means we are entering for the first time
            // the count will be 1
            System.out.println("Enter for the first time " + currentChar );
            charFreq.put(currentChar, 1);
        }else{
            // if we come to this point it means it has already showed up
            // so we update the count with extra than existing count
            charFreq.replace(currentChar, charFreq.get(currentChar)+1);
        }
    }
        System.out.println("charFreq = " + charFreq);
    }
}
