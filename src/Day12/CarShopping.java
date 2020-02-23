package Day12;

public class CarShopping {
    public static void main(String[] args) {
        String carBrand="Corolla";
        int carPrice=60000;
        int budget=40000;

        if (carBrand.equals("Corolla")|| carBrand.equals("Tesla") && carPrice<=budget){
            System.out.println("Car Aquired!!!");
        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR!");
        }
    }
}
