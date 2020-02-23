package Day41;

public class ScrumTeamOfficeHour {
    public static void main(String[] args) {

        // we are going to create an object
                          // reference         // object
        ScrumTeamEmployee employee01 = new ScrumTeamEmployee();
        employee01.name = "Hasan";
        employee01.employee_ID = 123;
        employee01.jobTitle = "PO";
        employee01.age = 30;
        employee01.salary = 200000;
                                             // object
        ScrumTeamEmployee employee02 = new ScrumTeamEmployee();
        employee02.jobTitle = "Tester";
        employee02.name = "Miia";
        employee02.employee_ID = 234;

        employee02.standUP();

        ScrumTeamEmployee employee03 = new ScrumTeamEmployee();
        employee03.jobTitle = "Developer";
        employee03.name = "Ershat";
        employee03.employee_ID = 345;

        employee03.standUP();

        System.out.println("============");

        employee01.getEmployeeInfo();
        employee02.getEmployeeInfo();
    }
}
