package Day48;

public abstract class Employee {
    int id;
    String name;

    public Employee() {

    }

    // Why do we have constructor here?
    // We can not create an object out of it?
    //What is the point?
    // So that sub class can reuse the code of setting id and name
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void calculateAnnualSalary();
// This is optional : the only reason we put it in here was
    // to enforce sub class to provide toString method
    public abstract String toString();

}
