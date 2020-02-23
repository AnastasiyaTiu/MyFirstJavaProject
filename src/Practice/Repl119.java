package Practice;
import java.util.*;
import java.util.Arrays;
public class Repl119 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String email = input.nextLine();

            //Write your code below
            String[] emailSplit = email.split("@");
            Arrays.toString(emailSplit);
            // for(int i =0; i < emailSplit.length; i++){
            String id = emailSplit[0];
            String domain = emailSplit[1];
            if(!email.contains("@") ){
                System.out.println("invalid email");
            }else{
                System.out.println("Email id: " + id);
                System.out.println("Email domain: " + domain);
            }

        }
    }
