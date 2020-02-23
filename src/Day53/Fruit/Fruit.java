package Day53.Fruit;

public abstract class Fruit {
    String taste;
    String color;

    public Fruit(String taste, String color){
        this.color = color;
        this.taste = taste;
    }
    public abstract void getDigested();

    @Override
    public String toString(){
        return "HELLO FROM FRUIT";
    }
}
