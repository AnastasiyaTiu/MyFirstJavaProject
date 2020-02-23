package Day14;

public class EmailChecker {
    public static void main(String[] args) {

/*
 boolean containCharacter = email.contains("@");

        boolean notContainSpace =  email.contains(" ");

        boolean endsWith = email.endsWith("@gmail.com");
        boolean endsWith1 = email.endsWith("@mail.ru");
        boolean endsWith2 = email.endsWith("@yahoo.com");
 */

        String email= "abc@yahoo.com";
        if (!email.contains("@")  ||  email.contains(" ")){
            System.out.println("invalid email");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("Google mail ");
        }else if (email.endsWith("@yahoo.com")){
            System.out.println("Yahoo mail ");
        }else if (email.endsWith("@mail.com")) {
            System.out.println("Russian mail ");
        }

    }
}
