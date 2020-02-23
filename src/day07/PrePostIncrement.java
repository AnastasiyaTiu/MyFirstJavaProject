package day07;

public class PrePostIncrement {
    public static void main(String[] args) {
        //increment a
        int apple = 8;
        apple++; //incrementing by one
        System.out.println(apple); //printing the increased value
        //System.out.println(++apple); //increasing the value and print the value

        //apple++, when ++ comes after the variable
        //it's called post increment
        //it will increase the value
        //BUT it will reflect the increased the value next the variable show up!!
        System.out.println(apple++);
        System.out.println(apple);


    }
}
