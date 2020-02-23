package Practice;

import org.w3c.dom.ls.LSOutput;

public class Repl161 {
    public static void main(String[] args) {
        //  Scanner scan = new Scanner(System.in);
        int num = 1221;
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        int reversedNumber = 0;
        int originalNumber = num;
        while (num > 0) {
            // 12 % 10 = 2
            // 125 % 10 = 5
            // 3% 10 = 3
        int last_digit = num % 10;
        // 5 + 4 = 9
        // 5*10+4=54
        //54*10+3=543
        reversedNumber = reversedNumber * 10 + last_digit;
        num = num / 10;
    }
  System.out.println(reversedNumber == originalNumber);
}
}
