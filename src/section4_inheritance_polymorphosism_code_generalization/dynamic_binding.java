package section4_inheritance_polymorphosism_code_generalization;

public class dynamic_binding {
    public static void main(String[] args) {
//        Base b1 = new Derived();
//        b1.f();
//        b1.g();
//        b1.h();  invalid

        test(new Base());
    }

    static void test(Base b){
        b.f();
        b.g();
        if(b instanceof Derived)
            ((Derived)b).h();
    }
}

class Base {
    void f(){
        System.out.println("f() in base");
    }
    void g(){
        System.out.println("g() in base");
    }
}

class Derived extends Base {
    void f(){
        System.out.println("f() in derived");
    }
    void h(){
        System.out.println("h() in derived");
    }
}
