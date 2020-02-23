package Practice;
import java.util.*;
public class Repl127 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for(int i=0; i<inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }

            //TODO. Write you code below this line.
          // there are 2 different conditions
        // while days are increasing sequentially
        // the population is decreasing by its half

        /*
          Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
          Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
          Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
          Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
           ---- EXTINCT ----
         */
        // loop though each city population and
        // make it loose half of its population every day
        // until all cities have no humans left
          // find the most populated city index no
        int maxValueIndex = 0;

        for (int x = 0; x < inhabitants.length ; x++) {
            if (inhabitants[x] > inhabitants[maxValueIndex]) {
        maxValueIndex = x;
            }
        }
          // i<last   inhabitants[maxValueIndex]
        for(int x = 0; inhabitants[maxValueIndex]!=0; x++){
            for(int y=0; y < inhabitants.length; y++){
                inhabitants[y] = inhabitants[y]/2;
            }
            System.out.println("Day " + x + " " + Arrays.toString(inhabitants) );
    }
        System.out.println("----EXTINCT----");
    }
}
