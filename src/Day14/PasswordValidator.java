package Day14;

public class PasswordValidator {
    public static void main(String[] args) {
        //Password Validator

        String password = "Ab_1234$12csa";
        // maximum 8 char max 16 char
        boolean min8max16= password.length()>=8 && password.length() <=16;

        //It MuST CONTAINS _ OR $
        boolean mustContains_or$ = password.contains("_")  || password.contains("$");
        //

        //IT MUST NOT CONTAINS space
        boolean mustNotContainsSpace = ! password.contains(" ");
        //

        // IT MUSt START Ab
        boolean mustStartsWithAb = password.startsWith("Ab");
        if (min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartsWithAb){
            System.out.println("Valid Password");

        }else{
            System.out.println("Invalid Password");
        }
    }
}
