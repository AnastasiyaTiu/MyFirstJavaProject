package Practice;

public class Relp100 {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
       //  scan.next();
        String str = "breadjambread";
        int count =0;

        for (int i=0; i <= str.length()-5; i++){
            String word = str.substring(i, i+5);
            if(word.equals("bread")){
                count++;
            }
        }

        if (count == 2){
            int dIndex = str.indexOf('d');
            System.out.println(str.substring(dIndex + 1, str.lastIndexOf('b')));
        }else {
            System.out.println("nothing");
        }
    }
}
