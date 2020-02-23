package Day16;

public class Words {
        public static void main(String[] args) {

           String word1= "Java";
           String word2 ="";
           //in order to reverse a word, we need to take last character and put in first character
            //then put the second character at 1 location before first character

            //start getting character from last location till first location than save it

                    word2 += word1.charAt(3) + "" +word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
            System.out.println(  "word2= "+ word2);

        }
}
