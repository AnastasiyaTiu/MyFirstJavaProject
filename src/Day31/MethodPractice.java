package Day31;

public class MethodPractice {

    public static void main(String[] args) {
        //call directly since we are in same class
        sayHelloWorld7Times();
        // alternatively call using class name
        MethodPractice.sayHelloWorld7Times();
        // you can call static method of other class
        // using classname.methodName(...)
        MethodIntroduction.sayHello();
    }
    // Create a method to print 7 line of hello and call it sayHelloWorld7Times
    public static void sayHelloWorld7Times() {
// 3 print line statement
System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");

// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");

// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");



}


    //piece of code
}