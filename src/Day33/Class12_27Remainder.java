package Day33;

public class Class12_27Remainder {
   // write a method that can verify any number if it's even or odd
   //
   public static void main(String[] args) {
       OddEven(10);

       System.out.println(ConvertKmToMiles(56));

       System.out.println(ConvertGallonToLitters(6));
   }
public static void OddEven(int number){
    if(number%2==0){
        System.out.println(number + " is even number");
        return;
    }
    System.out.println(number + " is odd number");
}

   // Task 01: 1 write a method that can convert km to miles
    //                        Hint: 1 km = 0.612 miles

    public static double ConvertKmToMiles(double km){
       double miles = km * 0.612;

       return miles;
    }

    // Task 02: write a method that can convert gallons to litters
    //                           Hint: 1 G = 3.75 L

    public static double ConvertGallonToLitters(double gallons){
       double litters = gallons * 3.75 ;

       return litters;
    }



}
