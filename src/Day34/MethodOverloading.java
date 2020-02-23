package Day34;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println(12);
        // two version of subString method
        // 01234567890
        String name = "overloading";
        System.out.println(name.substring(6) );
        System.out.println(name.substring(1,4) );
        // two version of indexOf method (there are 4)
        System.out.println(name.indexOf("di") );
        System.out.println(name.indexOf("o", 2) );
        System.out.println("--------------");
        //Arrays.toString has 9 different version to accept different parameter

        //Method overloading
        // using same name and different parameter for different methods
        // to reuse the name fo similar actions
        // It does not concern return type and access modifier

        // method name + parameter list = method signature

        // We can not have 2 methods with  same method name and same method parameters
        sayHello();
        sayHello("Universe");
        sayHello("Denis");
        sayHello(100);
        System.out.println(sayHello("Muge", "Orman"));
    }
    public static void sayHello(){
        System.out.println("Hello, World");
    }
    public static void sayHello(String name){
        System.out.println("Hello, "+ name);
    }
    public static void sayHello(int num){
        System.out.println("Hello, " + num);
    }

    //this is regarded as same method as above method
    //public static void sayHello(int x){
    //
    //}
    public static String sayHello(String firstName, String lastName){
       return "Hello " + firstName + " "+lastName;

    }
}
