package Practice;

//import java.util.Scanner;

public class Repl96 {

    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        String word = "java";    //scan.next();
        String separator = "this";         //scan.next();
        int count = 3;               //scan.nextInt();

        String output = word;
        for (int i = 1; i < count; i++){
            output += separator+word;
            System.out.print(output);
        }
    }
}
