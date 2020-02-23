package day10;

public class Calculator2 {
    public static void main(String[] args) {
        int num1 = 120;
        int num2 = 10;
        char operator = '/'; //  +-*/

        switch (operator) {

            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 + num2);
                break;

            case '*':
                System.out.println(num1 + num2);
                break;

            case '/':
                System.out.println(num1 + num2);
                break;

            default:
                System.out.println("INVALID OPERATOR!!!");
                break;
        }
    }
}
