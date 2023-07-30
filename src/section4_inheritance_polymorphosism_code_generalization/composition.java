package section4_inheritance_polymorphosism_code_generalization;

public class composition {
    public static void main(String[] args) {

    }
}

class BasicCalculatorComposition {
    BasicCalculator calc = new BasicCalculator();

    public int add(int a, int b){
        return calc.add(a, b);
    }

    public int subtract(int a, int b){
        return calc.subtract(a, b);
    }
}
