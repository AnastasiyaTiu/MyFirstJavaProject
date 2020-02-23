package Day48;

class Test{
    public Test(){
        // this();
        this("Sumeyye");
        System.out.println("Hola");
    }

    public Test(String str){
       // this();
        System.out.println(str);
    }

    public Test(int a){
        // Test();
        // System.out.println("Hello");   // error to create it before this();
        this();  // Hola
       // this("Muge");
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test obj = new Test(10);

    }
}


public class This_Keyword {
    int a = 100;

    public void method1(){
        System.out.println(this.a);  // calling instance variables
        //this.This_Super_Keyword();
    }

    public void method2(){
        this.method1();   //calling instance method
    }

    public static void main(String[] args) {
        // this.a;   // this is no object instance in static method
       // System.out.println(This_Super_Keyword.a );  // a is not static method

        This_Keyword obj = new This_Keyword();
        System.out.println(obj.a);
    }
}
