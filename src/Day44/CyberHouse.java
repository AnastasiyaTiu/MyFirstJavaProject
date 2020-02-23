package Day44;

public class CyberHouse {
    int houseNum;
    String design;
    // we can change default value of the fields
    // by assigning value directly in the template class
     static String neighbourhoodName = "Cybertek Ave";

    // constructor can access anything
    public CyberHouse ( String design, int houseNum){
        this.houseNum = houseNum;
        this.design = design;
    }
    // instance method can access anything
    public void showAllInfo(){
        System.out.println("houseNum = " + this.houseNum
                + ", design = " + this.design
                + ", neighbourhoodName = " + neighbourhoodName);

    }
    // static method can only access static members of same class
    public static void showNeighborhood(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);
        // CAN NOT ACCESS ANYTHING NON STATIC INSIDE STATIC METHOD
        // System.out.println("houseNum = " + houseNum);
    }

}
