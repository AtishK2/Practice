package SingletonPattern;

public class TestBrowser {
    public static void main(String[] args) {
        Browser instance = Browser.getInstance();
        instance.displayMessage();
    }
}
