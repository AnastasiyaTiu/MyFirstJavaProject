package Practice;

import java.util.Scanner;

public class Case67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if (word.length() == 5) {
            //int lastChar=word.length()
            //System.out.println(word.indexOf(word.length()-1),0);
        } else if (word.length() < 5) {
            System.out.println("Too short!");
        } else {
            System.out.println("Too long!");
        }
    }
}
