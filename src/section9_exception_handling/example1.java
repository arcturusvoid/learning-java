package section9_exception_handling;

public class example1 {
    static int div(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(div(5, 2));
            System.out.println(div(5, 0));
        } catch (ArithmeticException e){
            System.out.println("Caught Exception" + e);
        }
    }
}
