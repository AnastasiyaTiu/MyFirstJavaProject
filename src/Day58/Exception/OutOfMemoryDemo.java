package Day58.Exception;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(999999999);
        for(int i = 1; i > 0; i++){  // OutOfMemoryError: Java heap space
            System.out.println("i = " + i);
            nums.add(i);

        }
    }
}
