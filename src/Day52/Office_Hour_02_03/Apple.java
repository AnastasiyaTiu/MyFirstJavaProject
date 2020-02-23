package Day52.Office_Hour_02_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {
    public static void main(String[] args) {
        Tester Hasan = new Tester("Hasan", "Manual Tester", 8500);
       /*
        System.out.println(Hasan.jobTitle); Manual Tester
        System.out.println(Hasan.employeeName);  Hasan
        System.out.println(Hasan.salary); 85000
         */
       // Hasan.getEmployeeInfo();
     Tester Alisa = new Tester("Alisa", "SDET", 120000);

     Tester Rauf = new Tester("Rauf", "QA", 100000);
     List<Tester> testersTeam = new ArrayList<>();
         testersTeam.addAll(Arrays.asList(Hasan, Alisa,Rauf) );
/*
         for(Tester eachTester : testersTeam){
             eachTester.getEmployeeInfo();
             System.out.println("=====================");
         }

 */
         Developers Anastasiya = new Developers("Anastasiya", 130000);
        // Anastasiya.getEmployeeInfo();

        Developers Emel = new Developers("Emel", 130005);
        Developers Muge = new Developers("Muge", 130010);

        List<Developers> developersTeam = new ArrayList<>();
           developersTeam.addAll(Arrays.asList(Anastasiya, Emel, Muge));
/*
           for( Developers eachDeveloper : developersTeam){
               eachDeveloper.fixingBugs();
           }         */

           List<ScrumTeam> scrum = new ArrayList<>();
           scrum.addAll(testersTeam); // parent class can reference to the child class object
           scrum.addAll(developersTeam);

           for(ScrumTeam eachMember : scrum){
               eachMember.getEmployeeInfo();
           }
    }
}
