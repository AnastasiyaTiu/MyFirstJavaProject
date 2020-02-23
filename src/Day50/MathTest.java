package Day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {
        Addition q1 = new Addition(10, 90);
        System.out.println("q1 before calculation : " + q1);
        q1.calculate();
        System.out.println("q1 after calculation : " + q1);

    Subtraction q2 = new Subtraction(90, 10);
        System.out.println("\n" + "q2 = " + q2);
        q2.calculate();
        System.out.println("q2 = " + q2);

        Subtraction q3 = new Subtraction(10, 90);
        System.out.println("\n" + "q3 before calculation : " + q3);
        q3.calculate();
        System.out.println("q3 after calculation : " + q3);

        Multiplication q4 = new Multiplication(10, 5);
        System.out.println("\n" + "q4 before calculation : " + q4);
        q4.calculate();
        System.out.println("q4 after calculation : " + q4);

        Division q5 = new Division(10, 5);
        System.out.println("\n" + "q5 before calculation : " + q5);
        q5.calculate();
        System.out.println("q5 after calculation : " + q5);

        Division q6 = new Division(10, 50);
        System.out.println("\n" + "q6 before calculation : " + q6);
        q6.calculate();
        System.out.println("q6 after calculation : " + q6);

        Division q7 = new Division(10, 0);
        System.out.println("\n" + "q7 before calculation : " + q7);
        q7.calculate();
        System.out.println("q7 after calculation : " + q7);

        System.out.println("====================");
        List<Question> allTestQuestions = Arrays.asList(q1, q2, q3, q4, q5, q6, q7);
        for(Question eachQ : allTestQuestions){
            System.out.println(eachQ);
        }

    }
}
