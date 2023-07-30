package section5_abstract_class;

import java.util.Scanner;

public class problem_statement {
    public static void main(String[] args) {
        drawShape(10, 20, 5, 15, new Line());
        drawShape(10, 20, 5, 15, new Rectangle());
    }

    static void drawShape(int x1, int y1, int x2, int y2, Graphic g) {
        g.setStart(x1, y1);
        g.setEnd(x2, y2);
        g.draw();
    }
}

abstract class Graphic {
    protected int x1, y1, x2, y2;
    public void setStart(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setEnd(int x2, int y2){
        this.x2 = x2;
        this.y2 = y2;
    }
    public abstract void draw();
}

class Line extends Graphic {
    public void draw(){
        System.out.printf("Draw a line from (%d, %d) to (%d, %d) %n", x1, y1, x2, y2);
    }
}

class Rectangle extends Graphic {
    public void draw(){
        System.out.printf("Draw a rectangle from (%d, %d) to (%d, %d) %n", x1, y1, x2, y2);
    }
}
