import java.util.ArrayList;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.printf("Drawing a rectangle with width %d and height %d\n", width, height);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.printf("Drawing a circle with radius %d\n", radius);
    }
}

class TestShapes {
    public static void drawShapes(ArrayList<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Shape has been drawn.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> mixedShapes = new ArrayList<>();
        
        mixedShapes.add(new Rectangle(5, 3));
        mixedShapes.add(new Circle(4));
  

        TestShapes.drawShapes(mixedShapes);
    }
}
