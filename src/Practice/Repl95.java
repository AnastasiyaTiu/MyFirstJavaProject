package Practice;

import java.util.Scanner;

public class Repl95 {

        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            char start = scan.next().charAt(0);
            char end = scan.next().charAt(0);
            //char count=0;
            for(char s= start; s<= end; s++){

                System.out.println(s + " ");
            }

        }
}
