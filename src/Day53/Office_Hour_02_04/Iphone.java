package Day53.Office_Hour_02_04;

public class Iphone extends Device{

    String platform;

    @Override
    public void sendMessage(){
        System.out.println("Hi from Iphone");
    }

    public void FaceTime(){
        System.out.println("Talking to Akbar through face time");
    }

    public void call(){
        System.out.println("Calling with Iphone");
    }
}
