package Practice;

public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return ""+firstName+" | "+lastName+" | "+age+"";
    }

    public Person(){
        String name = "undefined";
        String lastName = "undefined";
        int age = -1;
    }
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
