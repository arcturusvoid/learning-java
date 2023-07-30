package section6_interfaces;

public class interfaces4 {
    public static void main(String[] args) {
        test(new class4_1());
        test(new class4_2());
    }

    static void test(A4 a){
        a.f();
        a.g();
        A4.h();
    }
}

interface A4 {
    void f();
    default void g() {
        System.out.println("g() in A4");
    }
    static void h(){
        System.out.println("h() in A4");
    }
}

class class4_1 implements A4 {
    @Override
    public void f() {
        System.out.println("f() in class4_1");
    }
}

class class4_2 implements A4 {

    @Override
    public void f() {
        System.out.println("f() in class4_2");
    }
}
