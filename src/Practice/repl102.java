package Practice;


public class repl102 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String html = "input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
                // scan.nextLine();

       // String html = ;
        String name = "id=";

        for (int i =0; i < html.length()-1; i++) {

        }
            if (html.contains("<html>")) {

                System.out.println(html.substring(html.indexOf("\"")+1, html.lastIndexOf("\"")));
            } else {
                System.out.println("Invalid input!");
            }

        }
}
