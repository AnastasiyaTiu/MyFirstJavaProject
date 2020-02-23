package Day14;

import java.util.Scanner;

public class StringOfficeHour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You want food or not?");
        String mainOptions = scan.next();

       //NESTED
        if (mainOptions.equalsIgnoreCase("food")) {
            System.out.println("You have selected food ");
            System.out.println("You want meal or snack?");
            String secondaryOption = scan.next();

            if (secondaryOption.equalsIgnoreCase("snack")) {
                System.out.println("You have selected SNACK ");
            } else if (secondaryOption.equalsIgnoreCase("meal")) {
                System.out.println("You have selected MEAL ");
            } else {
                System.out.println("NO SUCH FOOD OPTION ");
            }
        }
    }
}