package Day31;

public class MethodPractice2 {

    public static void main(String[] args) {
        count1to10();
        //System.out.println();
        count1to10();
        //optionally you can call using classname.methodName();
        MethodPractice2.count1to10();
    }
    //does not matter where you put the method
    // as long as it's inside the class { }
    //and outside any of the method

public static void count1to10(){

    for (int i = 0; i <=10 ; i++) {
        System.out.println(i + " ");
    }
    System.out.println();
}
}
