package Day33;
import java.util.Arrays;

public class Repl126 {
        public static void main(String[] args) {
            String str =  "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

            String [] arr = str.split(", ");

            String shortestWord = arr[0];
            for(String each1  : arr){
              if(each1.length() < shortestWord.length() ) {
                   shortestWord = each1;
              }
              }

            // if there are evenly shortest words we will find out with another foreach
            // and store them in the string
           String shortWord = "";
            for( String each2 : arr){
                if (each2.length() == shortestWord.length()){
                    shortWord += each2 + " ";
                }
            }
            String[] arrShortestWords = shortWord.split(" ");
            Arrays.sort(arrShortestWords);
            System.out.println(Arrays.toString(arrShortestWords));


            // we will create an array with using
            // split method that contains allShortest words
            // then sort the array -->> print

        }
    }

