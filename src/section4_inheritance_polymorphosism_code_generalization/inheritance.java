package section4_inheritance_polymorphosism_code_generalization;

public class inheritance {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        System.out.println(calc.sin(10));
    }
}

class BasicCalculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
}

class ScientificCalculator extends BasicCalculator {
    private static final double PI = 3.141516;

    public double sin(double deg){
        return Math.sin((deg * PI) / 180);
    }
}
