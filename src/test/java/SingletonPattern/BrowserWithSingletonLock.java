package SingletonPattern;

public class BrowserWithSingletonLock {

    private static volatile BrowserWithSingletonLock instance;

    private BrowserWithSingletonLock() { }

    public static BrowserWithSingletonLock getInstance(){
        if(instance == null){
            synchronized (BrowserWithSingletonLock.class){
                if(instance == null){
                    instance = new BrowserWithSingletonLock();
                }
            }
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("Instance created & method called");
    }
}
