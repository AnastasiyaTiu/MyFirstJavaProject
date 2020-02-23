package Day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        int month=12;

        if(month>12 || month<1) {
            System.out.println("INVALID MONTH");
        }else if (month >= 3 && month <= 5){
            System.out.println("Spring");
        }else if(month >= 6 && month<=8){
            System.out.println("Summer");
        }else if(month > 8 && month < 12){
            System.out.println("Fall");
        // }else if (month == 12 && month ==1 && month ==2 ){  //IMPOSSIBLE!!!!!!
        }else if (month == 12 || month ==1 || month ==2 ){
            System.out.println("Winter!!!");
        }
    }
}
