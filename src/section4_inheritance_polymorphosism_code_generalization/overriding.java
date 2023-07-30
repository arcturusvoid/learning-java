package section4_inheritance_polymorphosism_code_generalization;

public class overriding {
    public static void main(String[] args) {

        Contact c1 = new Contact();
        c1.setName("Test");
        c1.setAddress("xyz");

        c1.print();


    }
}

class Person {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Name: " + name);
    }
}

class Contact extends Person {
    private String address;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Address: " + address);
    }
}
