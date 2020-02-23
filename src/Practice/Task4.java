package Practice;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the word with at least 3 characters");
        String word= "Winter";
        int wordLength = word.length();

        int firstCharIndex = wordLength -6;
        char firstChar = word.charAt(firstCharIndex);
        System.out.println("FIRST CHAR: " + firstChar);

        int lastCharIndex = wordLength -1;
        char lastChar = word.charAt(lastCharIndex);
        System.out.println("LAST CHAR: " + lastChar);

        System.out.println("LAST CHAR: " + word.charAt(word.length()-4 ));
    }
}
