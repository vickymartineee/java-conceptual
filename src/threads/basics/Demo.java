package threads.basics;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyMainThread m  = new MyMainThread();
        MyMainThread m1  = new MyMainThread();

        for(int i=0;i<5;i++){
            Thread myMainThread = new Thread(m);
            Thread myMainThread1 = new Thread(m);
            myMainThread.setName("Thread - "+ i);
            myMainThread1.setName("Thread M1 - "+ i);
            myMainThread.start();
            myMainThread1.start();
            Thread.sleep(1000);
        }

        for(int i=6;i<10;i++){
            Thread myMainThread = new Thread(m);
            myMainThread.setName("Thread - "+ i);
            myMainThread.start();
        }

    }
}
