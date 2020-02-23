package Practice;

public class Repl125 {
    public static void main(String[] args) {

        String[] str = {"John", "Kevin", "Scott"};
        String shortest = "";

        for(String eachWord : str){

            if(eachWord.length() < shortest.length()){
                shortest = eachWord;
            }
        }
        System.out.println(shortest);


    }
}
