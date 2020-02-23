package Day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        // Task:
        //Hero code is Superman and Identity is Clark Kent
        // The initial of the Hero is CK

        //Logic 1: split this String by dash -
        //to get 2 pieces of String into a String array
        String[] heroSplited = hero1.split("-");
        System.out.println("heroSplited = " + Arrays.toString(heroSplited));
        String heroCode = heroSplited[0];
        String fullName = heroSplited[1];
        // hero code is Superman and Identity is Clark Kent
       // System.out.println("Hero code is " + heroSplited[0] + " and Identity is " + heroSplited[1]);
        System.out.println("Hero code is " + heroCode + " and Identity is " + fullName);

        // the initial of the Hero is CK
        // I can just use fullName variable to finish this task

        //LOGIC 1: get the first letter of the fullName
        // then get the letter after the space
        //concatenate them
        // downside is what we have middle name
        // solution, instead of looking for the letter after first space
        //            look for last index of the space then get next Character


        // LOGIC 2:
        // We already have full name stored in fullName variable
        // split by space --> we will get firstName (middle name) lastName
        // get the first letter of full name
        // then get the last name using last item index
        // get the first character then concatenate
        // Clark Kent --> [  Clark Kent]  Clark -> C     Kent -> K   -->> CK
        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("fullNameSplitted = " + Arrays.toString(fullNameSplitted) );
        // last name will be always the last element of splitted full name
        // no matter the name has middle name or not
        String lastName = fullNameSplitted[ fullNameSplitted.length-1 ];
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is : " + fullName.charAt(0) + lastName.charAt(0));





    }
}
