package day05;

import java.util.Scanner;

public class hwPractice1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();


        String phoneNumber="areaCode+localNumber";

        System.out.println("Calling number "+ phoneNumber);

    }

}
