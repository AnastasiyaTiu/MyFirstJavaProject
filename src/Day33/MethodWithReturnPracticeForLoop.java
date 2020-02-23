package Day33;

public class MethodWithReturnPracticeForLoop {
    public static void main(String[] args) {
        // TODO 1, Call your method here to test
        System.out.println(getDaysOfTheWeekFromNumber(2));
        System.out.println(getDaysOfTheWeekFromNumber(89));

//TODO 2, OPTIONALLY , Create an int Array that has 5 numbers, test your code with those
        int[] allCodes ={5,3,11,4,33};
        for (int i = 0; i < allCodes.length; i++) {
            String day = getDaysOfTheWeekFromNumber(allCodes[i]);
            System.out.println("day = " + day);
        }
        System.out.println("-----------------");
        for (int eachCode : allCodes  ) {
            System.out.println("each day = " + getDaysOfTheWeekFromNumber(eachCode) );
        }






/*
 * getDaysOfTheWeekFromNumber
 * This method will take number from 1-7
 * and convert that to actual day in word
 * @param int dayCode to represent day in number
 * @return the day in word in English as String
 *         if the number is valid
 *         if the number is not 1-7 return INVALID DAY!
 */

}
public static String getDaysOfTheWeekFromNumber(int dayCode){
    String dayWeek = " ";
        switch (dayCode){
        case 1 :
            return "Monday";
            //dayWeek ="Monday";
         //break;
        case 2 :
            return "Tuesday";
            //dayWeek ="Tuesday";
        //    break;
        case 3 :
            return "Wednesday";
            //dayWeek ="Wednesday";
          //  break;
        case 4 :
            return "Thursday";
            //dayWeek ="Thursday";
            //break;
        case 5 :
           return "Friday";
           // dayWeek ="Friday";
            //break;
        case 6 :
           return "Saturday";
            // dayWeek ="Saturday";
            //break;
        case 7 :
            return "Sunday";
          //  dayWeek ="Sunday";
            //break;
        default:
           return "FUNDAY!!!";
            // dayWeek ="FUNDAY!!!";
    }
   // return dayWeek;

}
}