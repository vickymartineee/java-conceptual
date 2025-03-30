package threads.basics;

public class MyMainThread implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello is said from - "+ Thread.currentThread().getName());

    }
}
