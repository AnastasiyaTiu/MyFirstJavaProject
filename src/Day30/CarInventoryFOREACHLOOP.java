package Day30;

public class CarInventoryFOREACHLOOP {
    public static void main(String[] args) {
        String[] cars = {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

        // we can use contains, startWith, endWith to get same result

        int chev = 0;
        int civic = 0;
        for (String eachCar : cars ){
            if (eachCar.toLowerCase().startsWith("chevrolet")) {
                chev++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")){
                civic++;

            }
            }
        System.out.println("chev = " + chev);
        System.out.println("civic = " + civic);


    }

}