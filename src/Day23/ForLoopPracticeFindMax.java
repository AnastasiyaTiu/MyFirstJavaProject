package Day23;

public class ForLoopPracticeFindMax {
    public static void main(String[] args) {
        long[] salaries = {100000L, 250000L, 350000L, 400000L, 550000L};

        // i need to pick up an item from this array so i can compare with other items
        //since first one is right there, I just decided to pick it up
        // and make it temporarily the max value
        // can I pick 2nd or 3rd instead -->> Yes You CAN!

        /*
        Plain English Logic to find max salary

        write down the first number as temporarily max salary on a paper
        then go through each number and compare the number
        if the number you are comparing is more than what is on the paper
        delete the number and replace with bigger number
        keep doing this until you don't have any more number left


         */
                long maxSalary = salaries[0];
        for (long salary : salaries) {
            // check the current salary is more than max
            if(salary > maxSalary){
                //if so replace the existing value of max with current bigger salary
                maxSalary = salary;


            }
        }
        System.out.println("maxSalary = " + maxSalary);

    }
}
