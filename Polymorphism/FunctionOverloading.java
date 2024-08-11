package Polymorphism;

public class FunctionOverloading {
    // function overloading - static polymorphism, compile time poly

    public int add (int a, int b) {
        return a + b;
    }

    public int add (int a, int b, int c) {
        return add(a, b) + c;
    }


}
