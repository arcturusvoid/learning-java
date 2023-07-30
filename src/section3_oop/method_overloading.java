package section3_oop;

public class method_overloading {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.print(5);
        obj.print(5.00f);
        obj.print("5");
    }
}

class Sample {
    public void print(int a){
        System.out.println("Integer: " + a);
    }

    public void print(float a){
        System.out.println("Float: " + a);
    }

    public void print(String a){
        System.out.println("String: " + a);
    }
}
