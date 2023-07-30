package section7_solid;

/**
 * S - Single Responsibility Principle
 *      - A Class should have one and only one reason to change
 *
 * O - Open-closed Principle
 *      - Objects or entities should be open for extension but closed for modification
 *
 * L - Liskov Substitution Principle
 *      - Objects of super class shall be replaced with objects of subclasses
 *
 * I - Interface Segregation Principle
 *      - A client should never be forced to implement an interface that it does not use
 */
public class solid4 {
    public static void main(String[] args) {

    }
}

interface VegRestaurant {
    void vegMeals();

}

interface NonVegRestaurant {
    void NonVegMeals();
}

class ABCVegRestaurant implements VegRestaurant {
    @Override
    public void vegMeals() {
        System.out.println("Provides Veg Meals");
    }

}

class XYZRestaurant implements VegRestaurant, NonVegRestaurant {

    @Override
    public void vegMeals() {
        System.out.println("Provides Veg Meals");
    }

    @Override
    public void NonVegMeals() {
        System.out.println("Provides Non-Veg Meals");
    }
}

