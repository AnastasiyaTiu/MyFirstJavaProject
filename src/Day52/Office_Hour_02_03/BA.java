package Day52.Office_Hour_02_03;

public class BA extends ScrumTeam{
    /*          inherited features:
                   employeeName, jobTitle, salary
                   getEmployeeInfo            */
    public BA(String employeeName, double salary) {
        this.jobTitle = "Business Analyst";
        this.employeeName = employeeName;
        this.salary = salary;
    }
    @Override
    public void Demo(){
        System.out.println("Business Analyst " + this.employeeName + " is doing demo");
    }
    @Override
    public void DailyStandUp(){
        System.out.println("Business Analyst " + this.employeeName + " attend daily stand up");
    }
    public void gatherRequirement(){
        System.out.println("Business Analyst " + this.employeeName + " is gathering the requirements");
    }
}
