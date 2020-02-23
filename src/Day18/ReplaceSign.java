package Day18;

public class ReplaceSign {
    public static void main(String[] args) {
        String letters="J%a^V**$1a";

        letters = letters.replace("%", "")
                          .replace("^", "")
                          .replace("*", "")
                          .replace("$", "")
                          .replace("1", "")
                           .toUpperCase();
        System.out.println("letters = "+letters);

    }
}
