package Practice;
import java.util.Scanner;
public class case35 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String item = scan.nextLine();

            //WRITE YOUR CODE HERE
            int price = scan.nextInt();

            int balance = 100 - price;

            if (price > 100 && item.equals("Smartphone")) {
                System.out.println("Sorry, not enough funds on your gift card!");

            } else if (price > 100 && item.equals("Laptop")) {
                System.out.println("Sorry, not enough funds on your gift card!");

            } else if (price <= 100 && item.equals("Charger")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else if (price <= 100 && item.equals("USB cable")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else if (price <= 100 && item.equals("Headphones")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else if (price <= 100 && item.equals("Pants")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else if (price <= 100 && item.equals("Hat")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else if (price <= 100 && item.equals("Socks")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else if (price <= 100 && item.equals("Blanket")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else if (price <= 100 && item.equals("Pillow")) {

                System.out.println("Thank you for your purchse!");
                System.out.println("Your current balance is: " + balance + "$");

            } else {

                System.out.println("Invalid item!");
            }


        }
    }

