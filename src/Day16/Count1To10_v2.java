package Day16;

public class Count1To10_v2 {
    public static void main(String[] args) {
        int counter= 0;
        while (counter <= 10) {
            System.out.println(++counter);
            // ++counter --->> counter = counter + 1

        }


        int counter1 = 1;
        while(counter1 <= 10){
            System.out.println(counter++);
            // ++counter --> counter = counter +1`
        }

        int counter_ = 1;
        while (counter_++ < 10 ){
            System.out.println(counter_);
        }
    }
}
