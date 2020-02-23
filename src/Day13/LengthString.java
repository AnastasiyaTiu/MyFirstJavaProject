package Day13;

public class LengthString {
    public static void main(String[] args) {
        // in order to get how many character we have inside String
        // we can use length method of String
        //it will count each and every
        String s1 = "Hello";
        System.out.println(s1.length());

        int lengthOfStr = s1.length()  ;

        if (lengthOfStr > 4) {
            System.out.println("More than 4 character");
        }else{
            System.out.println("NOT MORE THAN 4");
        }

    }
}
