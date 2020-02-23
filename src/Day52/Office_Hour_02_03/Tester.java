package Day52.Office_Hour_02_03;

public class Tester extends ScrumTeam {
    /*   inherited features:
                    variables: employeeName, jobTitle, salary
                    methods: getEmployeeInfo()             */

    public Tester(String employeeName, String jobTitle, double salary){
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void Demo(){
        System.out.println("Tester " + this.employeeName + " is doing demo");
    }

    @Override
    public void DailyStandUp(){
        System.out.println("Tester "+ this.employeeName + " is attending the daily stand up");
    }

    public void foundBug(){
        System.out.println("Tester " + this.employeeName + " reported a bug");
    }
}
