package day08;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        int age=18;

        System.out.println(age>=18);
        if(age>=18){
            System.out.println("You are ready to vote!!!");
        }else{


        System.out.println("Wait until you are 18!");
        }
        Scanner scan= new Scanner(System.in);
        System.out.println("Guess my favorite number: ");
        int myFavoriteNum=scan.nextInt();
         if(myFavoriteNum==300) {
             System.out.println("Bingo!!!");
         }else{
             System.out.println("You are not my best friend!");

         }

    }
}
