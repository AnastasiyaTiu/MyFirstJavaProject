package Day19;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        // Homework
        // Create a program to

        // ask user two number and

        // add numbers within those range

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;

        for (int i = num1; i < num2; i++) {
            sum = sum + i;

        }
        System.out.println("The range of "+ num1 +" & "+num2+ " is "+ sum);

    }
}
