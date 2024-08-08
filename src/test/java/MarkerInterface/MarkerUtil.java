package MarkerInterface;

//Utility class with method to check if object is marked or not
public class MarkerUtil {
    public static Boolean checkIfMarked(Object object) {
        return object instanceof MarkerInterface;
    }

    public static void main(String[] args) {
        SampleClass instance= new SampleClass();
        if(MarkerUtil.checkIfMarked(instance))
            System.out.println("Object is marked with MarkerInterface");
        else
            System.out.println("Object is not marked with MarkerInterface");

    }
}
