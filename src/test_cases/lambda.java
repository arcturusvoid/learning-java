package test_cases;

import java.util.ArrayList;

interface FunctionalInterface {
    void absFun(int x);

    default void normalFun(){
        System.out.println("Hello");
    }
}

public class lambda {
    public static void main(String[] args) {
        FunctionalInterface fob = (int x) -> System.out.println(2 * x);
        fob.absFun(5);
        fob.absFun(100);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Printing using lambda");
        arrayList.forEach(n -> System.out.println(n));

        System.out.println("Printing multiple of 2 using lambda");
        arrayList.forEach(n -> {
            if(n % 2 == 0)
                System.out.println(n);
        });



    }
}


