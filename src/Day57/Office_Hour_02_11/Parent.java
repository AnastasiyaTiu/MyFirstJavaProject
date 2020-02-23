package Day57.Office_Hour_02_11;

public class Parent {
    String name;
    int age;
    int SSN;

    // constructor --> method
    public Parent(){
        name = "This parent's name is unknown";
        age = -1;
        SSN = -1;
    }
                    // local variable
    public Parent(String fullName, int age, int SSN) {
        name = fullName;
        this.age = age;
        this.SSN = SSN;
    }

    public void cookFood(String foodName){
        System.out.println("Cooking " + foodName);
    }

    // method --> actions
    // void return
    // 1 - User Story  --> 3 test cases

    public static void hi(){
        System.out.println("Hi, how are you?");
        System.out.println(1234);
        System.out.println(false);
    }

    // overLoading
    public static String hi(String name){
        return "Hello " + name;
    }

    // with return, we promise to return one data type only
    public static String hello(){
        return "Hello hello";
    }
    //can you overLoad mian method? YES
    // public static void main(){
    //
    // }
    //public static boolean main(int number){}

    public static void main(String[] args) {
        //call void method --> call by name
        hi();

        //call return method --> 2 ways to call it
        System.out.println(hello());

        //2nd way
        String greeting = hello();
        System.out.println(greeting);

        String word = "java";
        System.out.println(word.length()); //

        int lengthOfWord = word.length();

        int number = 9; // local variable

    }

    }
