package Day59;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

        //  This simple program will get certain character from Anastasiya's name
        //  according to the index user provided

        System.out.println("The Start");
        String name = "Anastasiya";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Anastasiya's name? ");
        int targetIndex = scan.nextInt();

        try {
            System.out.println(name.charAt(targetIndex));

       // }catch( Exception e){  // this is a general catch block that can catch any exception IS-A sub type of Exception
            // below will narrow down the catch block to
            // only catch StringIndexOutOfBoundsException and take action accordingly

        }catch( StringIndexOutOfBoundsException e){
            // getMessage is a method coming from Exception class and provide some more details about exception object
            System.out.println("Message from gerMessage method " + e.getMessage());
            System.out.println("Something unusual happened");

        }
        System.out.println("The End");

        // exception are object, so it has it's own class
        // and we can create object ourselves just like we did from any other classes
        // StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
        // System.out.println( e1. toString() );

    }
}
