package day06;

import java.util.Scanner;

public class TheValueOfVariable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("WHAT IS YOUR ORDER? I WANT THE SAME!: ");
        String yourOrder= scan.next();
        String myOrder=yourOrder;

        System.out.println("Your order "+yourOrder+"\n"+"My order "+myOrder);

    }
}
