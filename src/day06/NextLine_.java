package day06;

import java.util.Scanner;

public class NextLine_ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan.next();
        System.out.println("Your name is "+name);

        System.out.println("What is your age?");
        int age=scan.nextInt();
        //notice we are not storing this into variable
        // we just want below line to capture ENTER keyboard input
        //so that it does not accidentally get captured by
        //the nextLine we use to capture address
        scan.nextLine();
        System.out.println("Your age is " + age);

        System.out.println("What is your address");
        String address=scan.nextLine();
        System.out.println("Your address is "+address);
    }
}
