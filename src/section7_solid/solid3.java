package section7_solid;

/**
 * S - Single Responsibility Principle
 *      - A Class should have one and only one reason to change
 * O - Open-closed Principle
 *      - Objects or entities should be open for extension but closed for modification
 * L - Liskov Substitution Principle
 *      - Objects of super class shall be replaced with objects of subclasses
 *
 */
public class solid3 {
    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }

    static void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
}

class Vehicle {
    public void start(){
        System.out.println("starting the vehicle");
    }

    public void stop(){
        System.out.println("stopping the vehicle");
    }
}

class Bike extends Vehicle {
    public void start(){
        System.out.println("starting the bike");
    }

    public void stop(){
        System.out.println("stopping the bike");
    }
}

class Car extends Vehicle {
    public void start(){
        System.out.println("starting the car");
//        throw new RuntimeException("Boom you are gone");
    }

    public void stop(){
        System.out.println("stopping the car");
    }
}
