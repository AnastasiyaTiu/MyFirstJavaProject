package day07;

public class Score {
    public static void main(String[] args) {
        int score =50;
        System.out.println(++score);  //50
        System.out.println(score++);//51 and is ready to be 52 next time it show up
        System.out.println(score);  //52
        System.out.println(--score);  //51
        System.out.println(score--);  //still 51 and is ready to be 52 next time it show up


    }
}
