package Day21;

public class NestedLoopIntro {
    public static void main(String[] args) {
     // count from 1 to 5
        // repeat this 3 times


        for (int x = 1; x <= 5 ; x++) {
            System.out.println(x + " ");
        }
        System.out.println();

        for (int x = 1; x <=5 ; x++) {
            System.out.println(x + " ");
        }
        for (int x = 1; x <=5 ; x++) {
            System.out.println(x + " ");
        }



        for (int i = 1; i <=3 ; i++) {

            System.out.println("Iteration : " + i);

            for (int x = 1; x <=5 ; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
