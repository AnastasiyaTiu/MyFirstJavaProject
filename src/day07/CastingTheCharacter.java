package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {
        char grade = 'B';
        System.out.println(grade);

        // 'B' is represented by 66 in ascii table
        // here type char is automatically widened to int
        //and stored as number

        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2='b';
        System.out.println(letterInNumber2);

        //-----------------------

        // saving the number as a char
        // so we can get the character representation
        //of the number is ascii table
        //char myFirstChar = (char) 100 ;
       // System.out.println(myFirstChar);

        int myFirstChar = 'n';
        int mySecondChar = 'A';
        int myThirdChar = 'S';
        int myFourthChar = 'T';
        int myFifthChar = 'Y';
        int mySixthChar='A';

        System.out.println(" "+myFirstChar + 1 + " " + mySecondChar + " " + myThirdChar + " " + myFourthChar+" "+myFifthChar+" "+mySixthChar);


    }
}
