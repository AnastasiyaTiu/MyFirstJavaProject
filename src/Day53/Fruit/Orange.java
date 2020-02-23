package Day53.Fruit;

public class Orange extends Fruit {
    int vitCLevel;

    public Orange(String taste, String color, int vitCLevel) {
        super(taste, color);
        this.vitCLevel = vitCLevel;
    }

    @Override
    public void getDigested() {
        System.out.println("Orange with Vitamin C Level " + vitCLevel+
                " has color " + color+ " and it has "
                + taste + " taste when you digest" );
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vitCLevel=" + vitCLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
