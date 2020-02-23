package Practice;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid URL ");
        String validURL= scan.next();

        System.out.println(" The dot are located: "+validURL.indexOf(".")+ " and " + validURL.lastIndexOf(".") );
        System.out.println("The domain is "+ validURL.substring(validURL.indexOf(".")+1, validURL.lastIndexOf(".")));
    }
}
//wwwblackfridaycom