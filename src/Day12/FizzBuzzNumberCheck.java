package Day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {
        int number = 15;
        if(number%5==0 && number%3==0){
            System.out.println("FizzBuzz number");
        }else if (number%3==0){
            System.out.println("Buzz number");
        }else if (number%5==0){
            System.out.println("Fizz number");
        }else{
            System.out.println("Not my number!!!");
        }
    }
}
