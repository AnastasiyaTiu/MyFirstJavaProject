package Day18;

import java.util.Scanner;

public class SmartLockOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!");
        System.out.println("WHAT'S ThE PASSWORD ? ");

        //entering password for the first time
        String password = scan.next();

        while (! password.equals("B15") ){
            System.out.println("WRONG PASSWORD!! TRY AGAIN!");
            password=scan.next();
        }
        System.out.println("OPEN SESEAME!!!");
    }
}
