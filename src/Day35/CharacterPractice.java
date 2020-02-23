package Day35;

public class CharacterPractice {
    public static void main(String[] args) {

        // character class has lots of static methods
        // to perform actions on char values
        // isDigit, isLetter, isLetterOrDigit, isUppercase, isLowerCase
        // toUpper, toLowerCase
        System.out.println("IS DIGIT METHOD PRACTICE ");
        System.out.println(Character .isDigit('A'));
        System.out.println(Character .isDigit(' '));
        System.out.println(Character .isDigit('6'));

        String str = "A34B123C4X";
        // get the number out of this String
        // and store it into Integer variable
       String numsInStr = "";
        for (int i = 0; i < str.length(); i++) {
           // isDigit accept char   // each char
            if( Character.isDigit(str.charAt(i)) ){
                System.out.println("str.charAt("+i+") = " + str.charAt(i));
           // appending number character to the result numsInStr
                numsInStr += str.charAt(i);
            }

        }
        System.out.println("numsInStr = " + numsInStr);
        // The requirement says get the result as Integer object

        Integer num = Integer.valueOf(numsInStr);
        System.out.println("num = " + num);


    }
}
