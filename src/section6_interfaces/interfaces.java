package section6_interfaces;

public class interfaces {
    public static void main(String[] args) {

        Calculator calc; // reference variable
        calc = new BasicCalculator();
        System.out.println(calc.add(5, 5));
        System.out.println(calc.sub(5, 5));
        System.out.println(calc.sin(90));

    }
}

class  BasicCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double sin(double deg) {
        return Math.sin((deg * PI) / 180);
    }
}

interface Calculator {
    double PI = 3.141516;  // all field are public static final
    int add(int a, int b);  // all methods are public abstract
    int sub(int a, int b);
    double sin(double deg);
}
