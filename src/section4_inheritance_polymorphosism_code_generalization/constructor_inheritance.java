package section4_inheritance_polymorphosism_code_generalization;

public class constructor_inheritance {
    public static void main(String[] args) {

        Point2D p1 = new Point2D(10, 5);
        p1.print();

        Point3D p2 = new Point3D(20, 10, 5);
        p2.print();
    }
}

class Point2D {
    protected int x, y;
    public Point2D(){}
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.printf("(%d, %d)%n", x, y);
    }
}

class Point3D extends Point2D {
    private int z;

    public Point3D(){
        super();
    }
    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    @Override
    public void print(){
        System.out.printf("(%d, %d, %d)%n", x, y, z);
    }
}
