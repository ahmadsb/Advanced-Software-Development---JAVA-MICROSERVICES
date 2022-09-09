package multithreads;

public class B extends Ifc{
    @Override
    public void foo() {
        Ifc f = new Temp();
        f.foo();
    }
}
