package Day41;

public class ScrumTeamEmployee {

    String jobTitle, name;
    double salary ;
    int employee_ID, age;

    public void standUP(){
        System.out.println("This team stand Up meeting is at 10:45 am");
    }

    // create method which give me all the info about 1 employee at a time

    public void getEmployeeInfo(){
        System.out.println("Job Title: "+ jobTitle + "\n" +
                "Employee ID: "+  +employee_ID + "\n" +
                "Name: " + name +  "\n" +
                "Salary: " + salary + "\n" +
                "Age: " +age);
    }
}
