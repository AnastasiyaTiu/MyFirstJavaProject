package Day21;

public class OddNumberPrintingRepetition {
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {

            System.out.println("Iteration : " + i);

            for (int x = 1; x <=10 ; x++) {
                if (x % 2 == 0) {
                    continue;
                }
                System.out.print(x + " - ");
            }
            System.out.println();
        }

    }
}
