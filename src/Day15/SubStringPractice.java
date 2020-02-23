package Day15;

public class SubStringPractice {
    public static void main(String[] args) {
        // getting the part of the String out of another String
        //
                   //   0123456789012345
        String movie = "Lord Of The Ring";
        // sub String will return part of another string
        // starting from beginning index until right before ending index

        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = "+ wordOf);

        // I want to get the word OF from this movie
        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        // Get the second word!
                      //   0123456789012345
        // String movie = "Lord of the ring";

        // find out first space index
        // second word start right right after first space
        // so that our starting point
        // my ending point is one more than last index

        int startingPoint= movie.indexOf(" ")+ 1;
        int endingPoint = movie.length();
        System.out.println("second word till last: "
                + movie.substring(startingPoint, endingPoint)  );
        // assume we already know the location of the starting point of the second word
        // and the ending of the sentence

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("second word till last: "+ secondWordTillLast);

        String secondToLast = movie.substring(5);
                      //   0123456789012345
        // String movie = "Lord Of The Ring ";

        String ring = movie.substring(12,16);
        String ofThe = movie.substring(4,12);
        String lord = movie.substring(0, 4);

        System.out.println(ring + ofThe+"Java "+lord);



    }
}
