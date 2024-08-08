package InterviewPrep;

public class ThreadsDemo extends Thread {


    private int count = 0;

    public void increment() {
        count++;
        System.out.println("count = " + count);
    }

    @Override
    public void run(){
        increment();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadsDemo instance = new ThreadsDemo();
        instance.join();
        ThreadsDemo instance1 = new ThreadsDemo();
        instance1.join();
        ThreadsDemo instance2 = new ThreadsDemo();
        instance2.join();
        ThreadsDemo instance3 = new ThreadsDemo();
        instance3.join();

    }
}
