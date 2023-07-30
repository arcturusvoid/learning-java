package section2;

import java.util.Scanner;

public class first_program {
    // psvm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double si, p, t, r;

        System.out.println("Enter principal amount: ");
        p = sc.nextDouble();

        System.out.println("Enter tenure: ");
        t = sc.nextDouble();

        System.out.println("Enter rate: ");
        r = sc.nextDouble();

        si = (p * t * r) / 100;

        System.out.println("Simple Interest: " + si);

    }
}
