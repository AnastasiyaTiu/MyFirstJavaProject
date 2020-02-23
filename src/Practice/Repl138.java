package Practice;

public class Repl138 {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        String sentence = "Java is fun";

        String reversed = "";
        //TODO: start your code here
        String[] arr = sentence.split(" ");
        for (int x = arr.length-1; x >= 0 ; x--){
            // char currentChar = sentence.charAt(x);
            reversed += arr[x] + " ";
        }


        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
