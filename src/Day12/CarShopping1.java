package Day12;

public class CarShopping1 {
    public static void main(String[] args) {
        String carBrand="Tesla";
        int carPrice=50000;
        int budget=50000;

        if (carBrand.equals("Corolla")){
            System.out.println("Car Aquired!!!");
        } else if(carBrand.equals("Tesla") && carPrice<=budget) {
            System.out.println("Tesla Car Aquired!!!");
        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR!");
        }
    }
}
