package Day19;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
//  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scan.nextLine();
        char start = word.charAt(0);
        char end =  word.charAt(word.length()-1);

        if (start < end){
            for (int i = start; i <= end ; i++) {
                System.out.print(i + ", ");
            }

        }else if ( start > end ){
            for (int i = start; i <= end; i--) {
                System.out.print(i + ", ");
            }
        }

    }

}
