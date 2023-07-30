package section5_abstract_class;

public class abstract_class {
}

abstract class A {
    public void f(){
        System.out.println("f() in A");
    }
    public abstract void g();
    public abstract void h();

}

abstract class B extends A {
    public void g(){
        System.out.println("g() in B");
    }
}

class C extends B {
    public void h(){
        System.out.println("h() in C");
    }
}
