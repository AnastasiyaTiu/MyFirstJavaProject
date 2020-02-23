package Day48;


    class TestData{
        public TestData(){
            System.out.println("A");
        }
        int a = 100;

        public void method1(){
            //TestData obj = new TestData();
            System.out.println("super class instance methods");
        }
    }

    public class Super_Keyword extends TestData{
 public Super_Keyword(){
     super();
     System.out.println("B");
 }
 public void method1(){
     System.out.println("Sub class instance method");
 }



    public static void main(String[] args) {
      //  super.a = 300;
       // super.method1();
        // mm();

    }



}