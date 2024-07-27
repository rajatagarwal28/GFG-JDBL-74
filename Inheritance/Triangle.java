package Inheritance;

public class Triangle extends Shape {
    int b;
    int h;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public void area() {
        System.out.println(0.5*b*h);
    }
}
