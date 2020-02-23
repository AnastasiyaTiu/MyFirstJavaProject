package day10;

public class Answer {
    public static void main(String[] args) {
        String myAnswer="";
        int myNumber=20;

        if (myNumber%5==0){
            myAnswer="Fizz Number";

        }else{
            myAnswer="not a Fill Number";
        }
        System.out.println("My number is "+myNumber);
        System.out.println("it is "+ myAnswer);
    }
}
