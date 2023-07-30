package section2;

public class branching_statements {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if (a > b){
            System.out.println("a is bigger");
        }
        else if (b > a){
            System.out.println("b is bigger");
        }
        else {
            System.out.println("a and b is equal");
        }

        int day = 1;
        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
        }
    }
}
