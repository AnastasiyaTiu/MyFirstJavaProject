package Practice;

public class Task8 {
    public static void main(String[] args) {
        String sentence = "     I can do IT! ";
        System.out.println(sentence.trim());
        if (sentence.indexOf(" ")==sentence.lastIndexOf(" ")){
            System.out.println("You have entered 2 words");
        }else{
            System.out.println("You have entered more than 2 words");
        }

    }
}
