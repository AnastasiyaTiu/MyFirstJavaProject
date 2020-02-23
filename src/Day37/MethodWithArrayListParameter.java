package Day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {
        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");

        printAList(nameLst);
        String resultLongest = getLongestStringElement(nameLst);
        System.out.println("resultLongest = " + resultLongest);

//        byte myByte = 17;
//        printByte( myByte );
//
//        int myInt = 100;
//        printByte( myInt );
    }

    /**
     * Asimple method to print a byte value passed
     * @param lst
     */
    public static void printByte(byte b){
        System.out.println("You passed byte value = " + b);
    }


    // Create a method that accept a List of String as argument
    // same thing as a method that has List of String parameter
    // and print out each and every item in the list vertically
    // return nothing

    public static String getLongestStringElement(List<String> nameLst){
        String longestName = "";   // nameLst.get(0)

        for (int x = 0; x < nameLst.size(); x++) {

            String currentName = nameLst.get(x);
            // > will give your first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if( currentName.length() >= longestName.length() ){
                longestName = currentName;
            }
        }
        return(longestName);
    }

    /**
    This method will print out the content of passed List object vertically
    @param lst of String
    @return nothing
     */
    public static void printAList(ArrayList<String> lst){
        for(String each : lst){
            System.out.println("each = " + each);
        }
    }
}
