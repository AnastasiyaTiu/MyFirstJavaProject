package Day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        /*
        We need to provide the separator

        What do I get out of it?
        We get a String array out of it with each part splitted

        Does it actually change your original String?
        NO!!!!!!!!!!
         */

        String car = "Lexus-IS-F";
       String[] carSplitted = car.split("-");
       System.out.println("carSplitted = " + Arrays.toString(carSplitted));
        System.out.println("car = " + car);
       String model = carSplitted[1];
        System.out.println("model = " + model);
    }
}
