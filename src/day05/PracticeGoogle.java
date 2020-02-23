package day05;

import java.util.Scanner;

public class PracticeGoogle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature in F ? ");
        double farenheit = scan.nextDouble();
        double celcius=(5.0/9)*(farenheit-32);
        System.out.println("Farenheit "+farenheit+ " is "+celcius+ " in Celcius");


    }
}
