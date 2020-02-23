package Day14;

public class Method {
    public static void main(String[] args) {
        String str="I like Pumpkin";
        System.out.println("str = " + str);
        //contains:
        //it checks whether a string exists in another string
        //and return true or false result

        System.out.println("Does it contains Pumpkin: ");
        System.out.println( str.contains("Pumpkin")  );
                                 //true
        boolean gotPumpkin = str.startsWith("I");
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startWish endWish
        //check whether a string start with another string
        //check whether a string end with another string
        //and return true or false result
        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("started With I = " + endWithPumpkin);

    }
}
