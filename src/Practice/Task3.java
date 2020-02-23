package Practice;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Full name:");
        String fullName= input.nextLine();
        System.out.println("Initials is "+fullName.charAt(0)+fullName.charAt(5));

    }
}
