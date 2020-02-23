package Day48;

public class FullTimeEmployee extends Employee {
    double monthSalary;

    public FullTimeEmployee(int monthSalary, int id, String name){
        super(id, name);
        this.monthSalary = monthSalary;
    }

    @Override
    public void calculateAnnualSalary(){
        System.out.println("Full time Employee yearly : " + (monthSalary * 12));
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthSalary=" + monthSalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                " , Yearly : " + monthSalary*12 +
                '}';
    }
}
