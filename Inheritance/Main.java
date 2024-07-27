package Inheritance;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle(10, 5);
        shape.area();
        shape.echo();

        Shape square = new Square(10);
        square.area();
        square.echo();

    }
}
