package Day46;

 class Test{
    public static void main(String[] args) {
        Practice01_23.staticMethod();
    }
}

public class Practice01_23 {
    public static void staticMethod(){
        System.out.println("This is static method");
    }


     String name;
    static int stA = 10;

    int inB ;

    public static void main(String[] args) {
//        System.out.println(Practice01_23.name);
//        System.out.println("name = " + name);

        Practice01_23 obj1 = new Practice01_23();
        obj1.stA = 20;
        obj1.inB = 100;
        Practice01_23 obj2 = new Practice01_23();

        System.out.println("obj1.stA = " + obj1.stA); //20
        System.out.println("obj2.stA = " + obj2.stA);  //20

        System.out.println("obj1.inB = " + obj1.inB);
        System.out.println("obj2.inB = " + obj2.inB);

        System.out.println("======================");

        Practice01_23 Gunel = new Practice01_23();
        Gunel.name = "Gunel";

        Practice01_23 Yana = new Practice01_23();



    }
}
