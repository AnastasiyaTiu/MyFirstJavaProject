package Day48;

// Mammal is extending Abstract super class animal
// and yet Mammal is another Abstract class itself

public abstract class Mammals extends Animal {

    // if the sub class of abstract super class is also abstract
    // you are not required to provide body for abstract method
    // because abstract class can have abstract method
    // You Can Optionally Provide Body

    // public abstract void makeNoise();
    public abstract void drinkMilk();

}
