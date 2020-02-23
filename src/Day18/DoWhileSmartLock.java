package Day18;

import java.util.Scanner;

public class DoWhileSmartLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!");
        String password;

        do{
        System.out.println("WHAT'S ThE PASSWORD ? ");
        password=scan.next();
        } while (! password.equals("B15"));
        System.out.println("Door is Open!!!");


    }
}
