package multithreads;

public class Runner {
    public static void main(String []args) throws InterruptedException {
        System.out.println(" ====== call foo() of A =====");
        A a = new A();
        a.foo();

        System.out.println(" ====== call foo() of B =====");
        B b = new B();
        b.foo();

        System.out.println(" ====== call foo() of C =====");
        C c = new C();
        c.foo();
        // example for deadlock
//        Thread1 tb = new Thread1();
//        tb.start();
//
//        synchronized (tb){
//            tb.wait();
//            System.out.println("inside");
//        }
//        System.out.println("outside");

    }
}
