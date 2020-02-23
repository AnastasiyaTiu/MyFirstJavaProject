package Day54.Products;

import Day51.Person;

public class Clothes implements Wearable {
    int size;
    @Override
    public void wear() {
        System.out.println("Wearing Clothes!");
    }
    public static void main(String[] args) {
        Clothes c1 = new Clothes();
        Wearable w1 = new Clothes();
        Object o1 = new Clothes();
        //---------------------
        Perfume p1 = new Perfume();
        Wearable w2 = new Perfume();
        Cosmetics c2 = new Perfume();
        Object o3 = new Perfume();
        //---------------------
        MakeUps m1 = new MakeUps();
        Wearable w3 = new MakeUps();
        Cosmetics c4 = new MakeUps();
        Object o4 = new MakeUps();
        //------------------------
        Watch w = new Watch();
        Wearable w4 = new Watch();
        Object o2 = new Watch();
        Cosmetics c7 = new MakeUps();
    }


}
class Watch implements Wearable{
    @Override
    public void wear() {
        System.out.println("Wearing Watches!");
    }
}
class Perfume implements Wearable, Cosmetics{
    @Override
    public void wear() {
        System.out.println("Wearing Perfumes!");
    }
}
class MakeUps implements Wearable,Cosmetics{

    @Override
    public void wear() {
        System.out.println("Wearing Makeups!");
    }
}
