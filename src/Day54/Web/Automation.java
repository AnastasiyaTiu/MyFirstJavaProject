package Day54.Web;

public class Automation {
    public static void main(String[] args) {
        System.out.println("--Running on Chrome");
        WebDriver c1 = new ChromeDriver();
        c1.openBrowser();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();

        System.out.println("==Running on FireFox");
        c1 = new FireFoxDriver();
        c1.openBrowser();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();
    }
}
