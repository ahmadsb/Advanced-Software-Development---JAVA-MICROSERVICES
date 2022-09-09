package multithreads;

public class MyDeadLockExample {
    public static void main(String []args){
        String res1 = "First";
        String res2 = "Second";

        Thread t1 = new Thread(){
            @Override
            public void run(){
                synchronized (res1) {
                    System.out.println("res1 is locked by thread 1");

                    synchronized (res2){
                        System.out.println("res2 is locked by thread 1");
                    }

                }
            }
        };


        Thread t2 = new Thread(){
            @Override
            public void run(){
                synchronized (res2) {
                    System.out.println("res2 is locked by thread 2");

                    synchronized (res1){
                        System.out.println("res1 is locked by thread 2");
                    }

                }
            }
        };

        t1.start();
        t2.start();

        System.out.println("Main Done!!");



    }
}
