package day10;

public class Calculator {
    public static void main(String[] args) {
        char operator='A';

        switch(operator){
            case '+':
            System.out.println("Print you are about to add numbers");
            break;
            case '-':
                System.out.println("Print you are about to subtract numbers");
                break;
            case '*':
                System.out.println("Print you are about to multiply numbers");
                break;
            case '/':
                System.out.println("Print you are about to divide numbers");
                break;
            default:
                System.out.println("Print invalid operator");
                break;
        }
    }
}
