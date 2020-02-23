package day09;

public class DayPrinter {
    public static void main(String[] args) {

        int dayCode = 6;
        String dayName = "";
        if (dayCode == 1) {
            dayName = "Monday";
            // System.out.println("Day is Monday");
        }
        if (dayCode == 2) {
            dayName = "Tuesday";
            //System.out.println("Day is Tuesday");
        }
        if (dayCode == 3) {
            dayName = "Wednesday";
            //System.out.println("Day is Wednesday");
        }
        if (dayCode == 4) {
            dayName = "Thursday";
            //System.out.println("Day is Thursday");
        }
        if (dayCode == 5) {
            dayName = "Friday";
            // System.out.println("Day is Friday");
        }
        if (dayCode == 6) {
            dayName = "Saturday";
            System.out.println("YAY@@@ SATURDAY!!!!!!!");
        } else {
            System.out.println("Unknown!");
        }
    }
}