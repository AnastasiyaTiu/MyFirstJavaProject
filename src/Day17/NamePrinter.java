package Day17;

public class NamePrinter {
    public static void main(String[] args) {
        // if you have complain in life : call 1-800-Alexander
        String name = "Cybertek School Java Program";

        // get each and every character and print them out vertically
        int x = 0;
        // in order to print each character of a String
        // we need to start getting character
        // from index 0 till last index (  name.length()-1    )
        while (x < name.length() ){      //( x <= name.length()-1  )
        System.out.print("index " + x + " : ");
            System.out.println(name.charAt( x ));
        ++x;

        //System.out.println(name.charAt( x ));
    }
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(5));
//        System.out.println(name.charAt(6));
//        System.out.println(name.charAt(7));
//        System.out.println(name.charAt(8));



    }
}
