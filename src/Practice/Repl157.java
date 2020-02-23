package Practice;
import java.util.*;
public class Repl157 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion(scan.nextLine());
        }

        public static void timeConversion(String s) {
            /*
             * Write your code here.
             */

            String[] split = s.split(":");
            if (split[2].contains("AM") && split[0].equals("12")){
                split[0] = "00";
            }else if (split[2].contains("PM") && !split[0].equals("12")){
                split[0] = "" + (Integer.parseInt(split[0]) + 12 );
            }

                System.out.println(split[0] + ":" + split[1] + ":"+split[2].substring(0, 2));
        }
    }
