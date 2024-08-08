package SingletonPattern;

public class Browser {

    //    create private static member
    private static Browser browserInstance;

    //    create private constructor to restrict initialization/ object creation
    private Browser() {
    }

    //    Define a public static getInstance method to access the static member above
    public static Browser getInstance() {
        if (browserInstance == null) {
            browserInstance = new Browser();
        }
        return browserInstance;
    }

    //    Define a sample method which can be used to invoke post object access or creation
    public void displayMessage() {
        System.out.println("Inside displayMessage method");
    }

}
