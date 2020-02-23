package Day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {

        System.out.println(getDaysOfTheWeekFromNumber(2));
        System.out.println(getDaysOfTheWeekFromNumber(89));
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