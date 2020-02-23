package Day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        // given a String with even number character count
        // print 2 characters in one line
        //               0123
        // for example : Arya
        String name= "Ayra";
        int charCount = name.length();
        int indexOfLastChar = charCount-1;

        for (int i = 0; i <= indexOfLastChar-1 ; i++) {
            System.out.println(name.substring(i, i+2));
        }
        System.out.println("Getting 3 character");
        for (int i = 0; i <= indexOfLastChar-2 ; i++) {
            System.out.println(name.substring(i, i+3));
    }
}
    }