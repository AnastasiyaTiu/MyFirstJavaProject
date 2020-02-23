package Practice;

public class Repl106 {
    public static void main(String[] args) {
       // Scanner inp = new Scanner(System.in);
        //System.out.print("In:");
        //String word = inp.nextLine();
        //write your code below
        String word = " poopoo what idk what im doing";
        for (int i = 0; i < word.length(); i++){
            //char vowels = word.charAt(i);
            if (word.charAt(i)=='a' || word.charAt(i)=='o' ||
                    word.charAt(i)=='e' || word.charAt(i)=='u' || word.charAt(i)=='i'){
                System.out.println (word.charAt(i));
            }

        }

    }
}
