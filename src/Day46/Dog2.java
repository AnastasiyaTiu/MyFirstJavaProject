package Day46;

import Day45.Animal;

public class Dog2 extends Animal {
    public static void main(String[] args) {
        Dog2 twix = new Dog2();
        twix.speak();
    }

    // WHY DO WE WANT TO CALL SUPER CLASS VERSION OF OVERRIDDEN METHOD
    // we want to build on top what's already written
    // code reuse
    // parent provide step abc
    // child want to do abc defg
    // so instead of repeating abc
    // child can directly call super class version of the method
    // to perform abc then add defg
    @Override
    public void speak(){
        // super. can be used to specify we are calling
        // super class version of the method
        // can we use super, or this. outside of instance method
        // BIG NO!!!!!!!
        // it can only be used inside instance method
        // we can use super. or this. as many times as we want

        super.speak();
        System.out.println("Bark!!!");
        super.speak();
        super.speak();
    }
}
