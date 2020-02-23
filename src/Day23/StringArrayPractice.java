package Day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        // we created array in short way just by opening up{}
        // we put them in different line since white space does not matter

        String[] shows = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super girl"};

        String myFavoriteShow = shows[0];
//        System.out.println("myFavoriteShow = " + myFavoriteShow);
//        System.out.println("My favorite show character count is : "
//        + myFavoriteShow.length()  );

        System.out.println("myFavoriteShow = " + myFavoriteShow
                + " char count is: " + myFavoriteShow.length());

        int showsCount = shows.length;
        System.out.println("Shows Count = " + showsCount);

        for (int x = 0; x < showsCount ; x++) {
//            String currentShow = shows[x];
//            System.out.println( currentShow + " has character count: "
//                    + currentShow.length());
            System.out.println(shows[x] + " has character count : " + shows[x].length() );
        }

    }
}
