package Day22;

public class BiteArray {
    public static void main(String[] args) {

        // create a bite array with size 4
        // and store it into a variable called data

        byte[] data = new byte[4];
        data [0] = 5;
        data [1] = 15;
        data [2] = 25;
        data [3] = 55;
        // assign the value for each index location

        // print out the values at each index
        System.out.println( data [0]);
        System.out.println( data [1]);
        System.out.println( data [2]);
        System.out.println( data [3]);
        //update last index value
        data [3] = 127;
        // then print it out
        System.out.println(data[3]);
    }
}
