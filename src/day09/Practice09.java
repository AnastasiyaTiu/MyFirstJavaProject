package day09;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Current Speed: ");
        int curSpeed=input.nextInt();

        if(curSpeed > 60) {
            System.out.println("Slow down");
            int dif = curSpeed - 60;
            curSpeed -= dif;
        }else{
            System.out.println("Keep driving");
        }
        System.out.println(curSpeed);
    }
}
