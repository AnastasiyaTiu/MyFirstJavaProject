package Day42;

public class Teacher {
    private String name;
    private int age;

    // bad idea to have main method here, lets do it anyway


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        // what if setting the age require 100 lines of check?  you can add right here
        this.age = age;
    }

    // a method to set both age and name
    public void initializeFields(String name, int age){
        this.name = name;
        this.age= age;
        // what if setting the name require 100 lines of check
        // what if setting the age require 100 lines of check
        // can I just reuse the method I already have for setting name and age
       setName(name);
       setAge(age);
    }

}
