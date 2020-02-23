package Day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        /*
        create a long array or 5 items called salaries
        put your salary amounts that ok for your offer

        use for each loop to iterate over them
         and print them out

         Optionally:
         print only the salary more than 100000

         */
         long[] salaries = {100000L, 250000L, 350000L, 400000L, 550000L};

        for (long offers : salaries){
            System.out.println("Offers = " + offers);
        }
        for ( long salary: salaries ) {
//            if (salary > 100000 ){
//                System.out.println("salary = " + salary);
//            }
            //how can I skip salaries less than or equal to 100000?

            if (salary <= 100000){
                continue;
            }
            System.out.println("salary = " + salary);

        }

    }
}
