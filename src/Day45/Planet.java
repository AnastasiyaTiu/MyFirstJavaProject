package Day45;

public class Planet {
    double gravity;
    int radius;
    boolean hasLife;

    // constructor
    public Planet(){

    }

    public Planet(double gravity, int radius, boolean hasLife){
        this.gravity = gravity;
        this.radius = radius;
        this.hasLife = hasLife;
        System.out.println("Crazy Change");
    }


}
