package Inheritance;

public class Square extends Shape {
    int side;
    int h;

    Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println(side * side);
    }
}
