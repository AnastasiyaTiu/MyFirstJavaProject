package Day33;

public class ReturnKeywordPractice {
    public static void main(String[] args) {


        System.out.println(calculateAgeFromBirthYear(1996));
        System.out.println(calculateAgeFromBirthYear(2019));
        /*Create a class called ReturnKeywordPractice with main
                calculateAndReturnAge
                Write a method accept a birth year and return the age :
        the birth year should be within the range of 1900-2020
        if not return 0
         */
    }
    public static int calculateAgeFromBirthYear(int birthYear){
       int currentYear = 2019;
        int age = 0;
        if (birthYear <= 1900 || birthYear >= 2020){
            return 0;
        }
        age = currentYear-birthYear;
        return age;
    }








}
