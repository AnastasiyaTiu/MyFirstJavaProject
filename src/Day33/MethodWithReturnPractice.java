package Day33;

public class MethodWithReturnPractice {
    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(10));

        System.out.println(build_GOT_Email("Arya","Stark"));
        System.out.println(build_GOT_Email("Sam", "Tarly"));


        // yuo are given a variable fullName that has first name and last name
        // use this full name to generate GOT_Email
    String fullName = "Susan cure";
    //store this resulting email
//        String part1 = fullName.split(" ")[0]  ;
//        String part2 = fullName.split(" ")[1]  ;
//        //store this resulting email
//        String herEmail= build_GOT_Email(part1,part2);
//        System.out.println("herEmail = " + herEmail);

        String[] fullNameSplit = fullName.split(" ");
        String herEmail = build_GOT_Email(fullNameSplit[0] , fullNameSplit[1] );
        System.out.println("herEmail = " + herEmail);

    }

/*
getSumFrom1toX
this method should calculate the sum of
the numbers from 1 to the number user passed
@param x final number to be added
@return the sum of numbers from 1 to x

 */
public static int getSumFrom1toX(int x){
    int sum = 0;
    for (int i = 1; i <= x; i++) {
       sum += i;
    }
    return sum;

}
/*
 * build_GOT_Email
 * This method should build email using user's first and last name
 * for example Jon Snow --->> JSnow@NightWatch.com
 * @param firstName user's first name
 * @param lastName  user's last name
 * @return the email created using
 * firstName initial+lastname+@NightWatch.com
 */
public static String build_GOT_Email(String fistName, String lastName){

//
//    String email = fistName.charAt(0) + lastName+ "@NightWatch.com";
//    return email;
    return fistName.charAt(0) + lastName + "@NightWatch.com";
}




}