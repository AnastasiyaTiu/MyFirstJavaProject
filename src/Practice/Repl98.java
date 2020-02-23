package Practice;

import java.util.Scanner;

public class Repl98 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int countHi = 0;

        for(int x = 0; x <= str.length()-2; x++){
            String wordHi = str.substring(x, x+2);    //str.indexOf('h')
            if (wordHi.equals("hi")){
                countHi++;

           }

    }
        System.out.println("count HI: "+ countHi);
}
}