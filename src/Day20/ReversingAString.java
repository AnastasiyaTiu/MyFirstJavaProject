package Day20;

public class ReversingAString {
    public static void main(String[] args) {
        String name = "Anastasiya Tiunova";
        String reverseName = "";
        int lastCharIndex = name.length()-1;
        for (int i = lastCharIndex; i >= 0 ; i--) {
            System.out.println(i + " index : ");

            char currentChar=name.charAt(i);
            System.out.println(currentChar );
            reverseName += currentChar;
        }
        System.out.println("reverseName = " + reverseName);
    }
}
//System.out.println(name.charAt(7));
////        System.out.println(name.charAt(6));
////        System.out.println(name.charAt(5));
////        System.out.println(name.charAt(4));
////        System.out.println(name.charAt(3));
////        System.out.println(name.charAt(2));
////        System.out.println(name.charAt(1));
////        System.out.println(name.charAt(0));