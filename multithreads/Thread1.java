package multithreads;

import static java.lang.Thread.sleep;

public class Thread1 extends Thread{

    @Override
    public void run() {
        synchronized (this){
            try {
                sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello Thread1");
            notify();
        }
    }
}
