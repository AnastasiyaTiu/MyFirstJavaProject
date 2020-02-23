package Day37;

import java.util.ArrayList;

public class ArrayListLoopPractice {
    public static void main(String[] args) {


        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Anastasiya");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        System.out.println("nameLst = " + nameLst);
        // find longest name
        // assume the first one is the longest then compare with the rest
        String longestName = "";   // nameLst.get(0)

        for (int x = 0; x < nameLst.size(); x++) {

            String currentName = nameLst.get(x);
         // > will give your first longest name if you have more than one
        // >= will give you last longest name if you have more than one
            if( currentName.length() >= longestName.length() ){
                longestName = currentName;
            }
        }
        System.out.println("longestName = " + longestName);

        // How do I get the concatenation of all longest words if there are more than one
        // first find find out the longest word , and get

        // length   :  counting the elements inside array, it's a property of array object
                   // last element of an array : arr[arr.length-1]
        // length()  : counting the characters inside String, it's a method of String object
                // last char of a String: str.charAt( str.length()-1)
        //  size()  : counting the elements inside ArrayList object
              // last element of an ArrayList : lst.get(lst.size()-1)

        // How do we use for each loop to go through each items
        System.out.println("-----------------");
        for(String currentName : nameLst ){
            System.out.println("currentName = " + currentName);
        }


    }
}
