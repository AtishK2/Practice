package SingletonPattern;

public class SingletonLockTest {
    public static void main(String[] args) {
        BrowserWithSingletonLock instance = BrowserWithSingletonLock.getInstance();
        instance.printMessage();

        BrowserWithSingletonLock.getInstance().printMessage();
    }
}
