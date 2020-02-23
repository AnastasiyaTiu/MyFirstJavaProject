package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        // checking for String equality should be always done using equal method of the String
        //oneString.equals(anotherString)  --->> true or false
        // each and every String object you created will have this functionality

        // just comparing 2 String literal directly using equals method
        // This is smth that you will rarely use
        //System.out.println("Java".equals("java"));

        String myStr="Java";
        System.out.println(myStr.equals("Java"));
        // Intellij display original as helper, it's not part of your code
        //please ignore and keep typing, do not type original just type your text
        String yourStr = new String("Java");

        System.out.println("is my String same as your string?");
    // how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));
    }
}
