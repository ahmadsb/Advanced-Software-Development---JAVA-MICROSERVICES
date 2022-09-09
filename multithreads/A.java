package multithreads;

public class A extends Ifc{
    @Override
    public void foo() {

        Ifc f = new Temp();
        f.foo();
    }
}
