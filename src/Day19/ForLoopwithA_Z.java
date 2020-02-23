package Day19;

public class ForLoopwithA_Z {
    public static void main(String[] args) {
        String line = "";

        for (char iChar = 'A'; iChar <= 'Z'; iChar++){
            line += iChar;
            System.out.println(line);
        }
    }
}
