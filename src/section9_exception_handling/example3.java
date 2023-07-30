package section9_exception_handling;

public class example3 {

    public static void f(int a) throws MyException, MyException2 {
        if(a == 1)
            throw new MyException();
        if (a == 2)
            throw new MyException2();
    }
    public static void main(String[] args) {
        try {
            f(1);
        } catch (MyException e) {
            e.printStackTrace();
        } catch (MyException2 e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {}
class MyException2 extends Exception {}
