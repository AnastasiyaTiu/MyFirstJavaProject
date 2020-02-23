package Practice;

import java.util.Scanner;

public class Repl153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String s){


        //your code here
        String[] splitted = s.split(",");
         for(int x = 0; x < splitted.length; x++) {

         }
             System.out.println("person name: " + splitted[0] +
                     " last name: " + splitted[1] + " age: " + splitted[2]);

         }//end person
}
