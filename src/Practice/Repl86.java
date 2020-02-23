package Practice;

import java.util.Scanner;

public class Repl86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        while(day > 0){
            System.out.println("Day "+ day+ "[" + inhabitants + "]");
            day++;
            inhabitants= inhabitants/2;

        }
        System.out.println("---- EXTINCT ----");
    }
}
