package Day21;

public class SkipAll5 {
    public static void main(String[] args) {
        // continue
        //if line contains continue reaches, the loop will skip to next iteration

        // WE CAN USE break and continue for any type of loop

        for (int x = 1; x <= 100 ; x++) {
            if (x % 5 == 0){
                System.out.println("SKIPPING " + x);
                continue;
            }
            System.out.println(x);
        }

        ///  without continue statement



        for (int x = 1; x <= 100; x++) {
            if (x % 5 != 0) {
                System.out.println(x);
            } else {
                System.out.println("SKIPPING " + x);
            }
        }
    }
}
