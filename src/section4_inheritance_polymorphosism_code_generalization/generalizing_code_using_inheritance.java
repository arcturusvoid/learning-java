package section4_inheritance_polymorphosism_code_generalization;

public class generalizing_code_using_inheritance {
    public static void main(String[] args) {
        feed(new Animal());
        feed(new WildAnimal());
        feed(new DomensticAnimal());
        feed(new Lion());
        feed(new Tiger());
        feed(new Cow());
        feed(new Dog());

        feed(new Human());
        new Dog().print();
    }

    static void feed(Object feed){
        System.out.println("Feeding an animal");
    }
}

class Animal {
    public void print(){
        System.out.println("Base Animal");
    }
}
class WildAnimal extends Animal {}
class DomensticAnimal extends Animal {}
class Lion extends WildAnimal {}
class Tiger extends WildAnimal {}
class Cow extends DomensticAnimal {}
class Dog extends DomensticAnimal {}
class Human { }
