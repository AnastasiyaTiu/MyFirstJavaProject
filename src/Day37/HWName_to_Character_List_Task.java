package Day37;

import java.util.ArrayList;
import java.util.List;

public class HWName_to_Character_List_Task {
    public static void main(String[] args) {
/*
        Given List of names with various character count,
        Remove any name with less than 2 characters
        and if any name has more than 10 character only keep 10 characters
        and if it has exactly 5 characters , reverse it
        Of course , Optionally make a method out of it.
 */


    /**
     * Create a method that accept String object
     * and return List<Character> that contains each character
     *
     */
        System.out.println( nameCharsToList("Sumeyye") );

        List<Character> resultList = nameCharsToList("Muge");

        resultList.add('M');
        System.out.println("resultList = " + resultList);
    }

    /**
     * a method thta accept String object and turn it into List<Character>
     * @param name
     * @return  List<Character> that contains each Character.
     */
    public static List<Character> nameCharsToList(String name){

        List<Character> charLst = new ArrayList<>();

        for (int i = 0; i < name.length() ; i++) {
            charLst.add( name.charAt(i)  );
        }
        return charLst;
    }
}
