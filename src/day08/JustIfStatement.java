package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed, dear driver? ");
        int currentSpeed=scan.nextInt();
        System.out.println("What is speed limit ");
        int speedLimit=scan.nextInt();

        if (currentSpeed>=speedLimit) {
            System.out.println("get pulled over by the police");
            System.out.println("giving ticket by the police");
            System.out.println("taking away some points on your record");
            System.out.println("go to court");
        }
        System.out.println("The end");
    }
}
