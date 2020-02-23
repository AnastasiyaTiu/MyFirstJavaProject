package Day31;

//WHY DO WE NEED A METHOD?
// REUSABLE CODE!!! AVOID CODE DUPLICATE!
public class MethodIntroduction {
    public static void main(String[] args) {

      // two ways to call static methods
        // ClassName.methodName(external data if needed)
        // if you are in same class
        // you can directly called them
        // methodName (external data if needed)
        //MethodIntroduction.sayHello(); // optional if you are in same class
        System.out.println("Begin");
        sayHello();
        System.out.println("==============");
        sayHello();
        System.out.println("The end");
        // 12 --> 13 (23, 24, 25) --> 14 --> 15(21, 23, 24, 25) --> 16 --> DONE!!!
    } // MAIN METHOD ENDS HERE!!!!

    // DO NOT CREATE A METHOD INSIDE MAIN METHOD
    // IT CAN BE ANYWHERE INSIDE THE CLASS OUTSIDE MAIN METHOD
    public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is Anastasiya");
        System.out.println("I love Java");
    }
}
