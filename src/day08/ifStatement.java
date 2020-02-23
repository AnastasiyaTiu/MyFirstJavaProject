package day08;

public class ifStatement {
    public static void main(String[] args) {
        int speedLimit=60;
        int currentSpeed=75;
        //if the current speed is more than speed limit

        boolean amISpeeding = currentSpeed > speedLimit ;
        //INSIDE THE PERENTHESIS WE CAN ONLY PUT
        //BOOLEAN VALUE: TRUE FALSE
        //BOOLEAN VARIABLE
        //AMY EXPRESSION THAT RETURN BOOLEAN VALUE

        //if (amISpeeding) {
        if(currentSpeed>speedLimit){

            System.out.println("get pulled over by the police");
            System.out.println("giving ticket by the police");
            System.out.println("taking away some points on your record");
            System.out.println("go to court");
        } else {
            System.out.println("go shopping!!");
            System.out.println("buy IceCream");
            System.out.println("Enjoy your day");
        }
        System.out.println("The end");
        //if not over the limit
        //
        //outside the statement, say the end
    }
}
