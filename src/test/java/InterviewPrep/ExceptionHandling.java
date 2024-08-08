package InterviewPrep;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            throw new IOException("Welcome ");
        } catch(IOException e){
            System.out.println(e.getMessage() +" IOException");
        } catch(Exception e){
            System.out.println(e.getMessage() +" Exception");
        }
        finally {
            System.out.println("Guest");
        }

    }
}
