package day06;

import java.util.Scanner;

public class CapturingOneItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        // nextLine method of Scanner is used to capture whole line
        String name= input.nextLine();

        System.out.println("You have entered "+ name);



    }
}
