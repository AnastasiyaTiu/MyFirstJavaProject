package Day48;

public class Ball implements Bouncible {
    String shape, color;

    @Override
    public void bounce(){
        System.out.println("This " + shape + " and " + color +
                " ball is bouncing if gravity is " + GRAVITY);
    }
    public Ball(String shape, String color){
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
