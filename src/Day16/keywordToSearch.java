package Day16;

public class keywordToSearch {
    public static void main(String[] args) {
        String keywordToSearch = "Java";
        String tabTitle=keywordToSearch+"--Google Search";
        if(tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith("--Google Search")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
}
