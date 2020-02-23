package Practice;

import java.util.Arrays;

public class Repl126 {
    public static void main(String[] args) {
        String str = "olive, hot pursuit, warning, python, angle," +
                " coffee, beech, boost, trainer";
        // *hot*pursuit
        String[] srtArr = str.split("//w{5}");
        System.out.println(Arrays.toString(srtArr));




    }
}
