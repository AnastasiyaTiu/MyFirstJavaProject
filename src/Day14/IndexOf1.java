package Day14;

import org.w3c.dom.ls.LSOutput;

public class IndexOf1 {
    public static void main(String[] args) {

    //         012345678901
    String name = "Game of Java";
     // find out last location of letter a shows up
    System.out.println("find out last location of letter a shows up");
        System.out.println(name.lastIndexOf("a"));

    //find out the location the character space shows up
        System.out.println("find out the location the character space shows up");
        System.out.println(name.lastIndexOf(" "));

     // find out the location of letter Ga shows up
        System.out.println(" find out the location of letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

       //find out the location of letter Kawa shows up
        System.out.println("find out the location of letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

        // if I DON'T USE contains methos, what would be my code
        // whether we have Kawa in this String, either using indexOf or lastIndex

        if (name.indexOf("Kawa") > -1){
            System.out.println("KAWA found!!!!");
        }else{
            System.out.println("NO KAwA - No Pumpkin");
        }

}
}
