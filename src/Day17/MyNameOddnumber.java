package Day17;

import java.util.Scanner;

public class MyNameOddnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();

        int x = 0;

        //  x <= name.length()-1 meaning:
        //  starting from 0

        // x
        //
        while( x < name.length() ) {
            if (x % 2 == 1) {
                System.out.print(name.charAt(x));
            }
            ++x;
        }
    }
}
