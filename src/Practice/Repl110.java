package Practice;

import java.util.Scanner;

public class Repl110 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
        for(String eachWord : words){
            char first = eachWord.charAt(0);
            int length = eachWord.length()-1;
            char last = eachWord.charAt(length);
            System.out.println(first +""+last);
        }

    }
}
