package Day49;

public class Cat extends Animal{
    String eyeColor;

    public void call(){
        System.out.println("The cat is calling meow meow");
    }

    @Override
    public void run(){
        System.out.println("The cat is running ... ");
    }

    @Override
    public void sleep(){
        System.out.println("The cat is sleeping ");
    }
}
