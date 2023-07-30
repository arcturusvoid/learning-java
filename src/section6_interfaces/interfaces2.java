package section6_interfaces;

public class interfaces2 {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.f();
        d1.g();
        d1.h();
        d1.i();
        System.out.println();

        Base b1 = d1;
        b1.f();
        b1.g();
        b1.h();

        System.out.println();
        Sample s1 = d1;
        s1.f();
        s1.g();

    }
}

interface Sample {
    void f();
    void g();
}

abstract class Base implements Sample {
    public void f(){
        System.out.println("f() in Base");
    }
    public abstract void h();
}

class Derived extends Base {
    public void g(){
        System.out.println("g() in Derived");
    }
    public void h(){
        System.out.println("h() in Derived");
    }
    public void i(){
        System.out.println("i() in Derived");
    }
}
