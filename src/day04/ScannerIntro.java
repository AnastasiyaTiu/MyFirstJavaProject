package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        //I want to save users input after asking some questions
        // and I want to save this input so I can so smth with it

        //Step1: Use scanner class to create scanner object
        //that have this functionality
        Scanner scan = new Scanner(System.in);

        //ask user to enter name
        System.out.print("Enter your first name please : ");

        // capture what user typed on keyboard in console
        String firstName = scan.next();

        //print the result of what we saved from user input
        System.out.println("You have entered : " + firstName);

        // ask question from user before entering

        System.out.println("What is your age: ");

        // capture what user typed on keyboard in console for age

        //scan.nextInt() is capturing ;;;
        int age = scan.nextInt();

        //print the result of users age

        System.out.println("Your age is: " + age );


    }
}
