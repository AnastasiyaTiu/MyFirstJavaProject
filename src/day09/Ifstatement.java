package day09;

public class Ifstatement {
    public static void main(String[] args) {
        // int num;
        // a variable inside method, must get initial value
        //before it's being used for the first time
        //and there should not be any change
        // this variable does not get value before usage
       // System.out.println(num);

        /*
         1 "Hello"
         2 "Salam"
         3 "Hola"
         4 "Merhaba"
         5 "Privet"
         6 "Szia"
         7 "Bonjour"
         */
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Enter your language option from 1-7");
       int languageOption=5;
        String greeting="";

        if (languageOption == 1) {
            greeting="Hello,SDET";

        }else if (languageOption == 2) {
            greeting="Privet,SDET";
        }else if (languageOption == 3) {
            greeting="Szia,SDET";
        }else if (languageOption == 4) {
            greeting="Merhaba,SDET";
        }else if (languageOption == 5) {
            greeting="Hola,SDET";
        }else {
            greeting="Unknown";

        }
        System.out.println("This is how the greeting work: "+ greeting);
    }

}
