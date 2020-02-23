package Day49;

public abstract class Animal {
    // 1 Object creation
int age;

    // information --> variable

// variable ==>> local, instance, static
    String color;
    String breed;

    // default constructor
    public Animal(){

    }

    //Actions --> method
    // method --> instance, constructor

    // concrete method
    public void eat(){
        System.out.println("The animal is eating");
    }

    public void call(){
        System.out.println("The animal is calling ...");
    }

    // what if we just declare a method should be in the child class,
    // and they have different body

    // abstract method == I want this method will be appear in both cat
    //and dog classes , yet they should have different body
    public abstract void run();

    public abstract void sleep();
}
