package day06;

import java.util.Scanner;

public class ScannerCapturing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=input.next();

        String anotherWord=input.next();

        System.out.println("You have entered "+name);
        System.out.println("You have entered "+ anotherWord);

    }
}
