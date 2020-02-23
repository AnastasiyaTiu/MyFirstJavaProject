package Day54.Web;

public class FireFoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url + " using FireFox Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox Browser");
    }
}
