package Day53.Office_Hour_02_04;

public class Samsung extends Device{
    String color;

    public void call(){
        System.out.println("Calling with Samsung");
    }

    @Override
    public void sendMessage(){
        System.out.println("Sending message with " + color);
    }
}
