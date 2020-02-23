package Day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //indexOf -->
        //find out index of another String inside this String
        //  012345678901

        String name = "Game of Java";

        //find out the location of Java
        // find out the location of letter o
        //find out the location of first space
        System.out.println("find out the location of Java");

        System.out.println(name.indexOf("Java"));
        System.out.println("find out the location of letter o");
        System.out.println( name.indexOf("o")  );
       //if the location is not found , we get minus number
        System.out.println("find out the location of uppercase O");
        System.out.println(name.indexOf("O"));
        // find out the location of first space
        System.out.println("find out the location of first space  ");
        System.out.println(  name.indexOf(" ")   );
    }
}
