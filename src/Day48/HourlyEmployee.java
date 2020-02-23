package Day48;

public class HourlyEmployee extends Employee {

   int hourlyWage, numbersOfHours;

   public HourlyEmployee(int hourlyWage, int numbersOfHours, int id, String name){
      super(id, name);
       this.hourlyWage = hourlyWage;
       this.numbersOfHours = numbersOfHours;
   }

   @Override
   public void calculateAnnualSalary(){
       System.out.println("Hourly Employee yearly : " + (hourlyWage * numbersOfHours));
   }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numbersOfHours=" + numbersOfHours +
                ", id=" + id +
                ", name='" + name +
                " , yearly salary = " + (hourlyWage * numbersOfHours)+
                 '}';
    }
}
