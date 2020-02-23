package Day15;

public class Practice_11_27 {
    public static void main(String[] args) {
        String message = "I love Java";


        System.out.println("message = <"+ message + ">");
        String messageTrimmed= message.trim();
        System.out.println("messageTrimmed = <" + messageTrimmed+">");

        // isEmpty --->> Check whether a String is empty, meaning there is nothing inside ""
        // isEmpty = yourString.length() == 0 --->> true
        String emptySpaces = "       ";
        System.out.println("emptySpacesAfterTrimmed length is : " + emptySpaces+">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is : " + emptySpacesAfterTrimmed.length() );
        System.out.println( "emptySpacesAfterTrimmed is empty??? : " + emptySpacesAfterTrimmed.isEmpty() );

        // isEmpty VS isBlank method from String class
        //  isEmpty ----> if yourString.length()>0 true else it's false
        // isBlank -->> if you have anything other than white spaces, get true, else get false

    }
}
