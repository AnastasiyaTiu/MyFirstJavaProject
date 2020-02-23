package day06;

import java.util.Scanner;

public class NextLine1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("You entered: "+name);

        System.out.println("Where do you live? ");
        String city=scan.nextLine();
        System.out.println("Your address is: "+city);

        System.out.println("What is your street address? ");
        String street=scan.nextLine();
        System.out.println("Your street address is: " +street);
    }
}
