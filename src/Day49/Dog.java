package Day49;

public class Dog extends Animal{
    // Dog is an animal

    String dogName;
    public void call(){
        System.out.println("The dog is calling meow meow");
    }

    @Override
    public void run(){
        System.out.println("The dog is running ... ");
    }
    @Override
    public void sleep(){
        System.out.println("The dog is sleeping ");
    }
}
