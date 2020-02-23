package Day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {

        System.out.println("The Start");
        String name = "Anastasiya";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Anastasiya's name? ");

        // we want to take different action according to
        // different type of exception happen during the program
        // we can have more than one catch block
        // to handle different types of exception
        // and take action according to the exception type at runtime

        try {
            int targetIndex = scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            System.out.println("End of try");

        }catch( StringIndexOutOfBoundsException e){

            System.out.println("You are out of bound!!!");
            System.out.println("Enter between 0 and " + name.length() );

        }catch (InputMismatchException block){
            System.out.println("Input mismatch, enter number!!! " + block);
            System.out.println("Here is what you get if you enter 0 " + name.charAt(0) );
        // YOU CAN HAVE AS MANY CATCH BLOCK AS YOU WANT!!!
        } catch(Exception e){
            System.out.println("IF I DON'T CATCH ABOVE 2 TYPES I WILL COME HERE!!!");
        }

        System.out.println("The End");


    }
}
