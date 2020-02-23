package day07;

import java.util.Scanner;

public class StringVariable {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String firstName = scan.next(); //"Anastasiya";
        String lastName = scan.next(); //"Tiunova";
        String company = scan.next(); //"Apple";
        //String email="Anastasiya_Tiunova@Apple.com";
        String email= firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is " + firstName+ " " + lastName+" and I work for "+company+" and my email is "+email);

    }
}
