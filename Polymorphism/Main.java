package Polymorphism;

public class Main {
    public static void main(String[] args) {
        FunctionOverloading f = new FunctionOverloading();
        int result = f.add(10, 10);
        int result2 = f.add(20, 20, 10);
        System.out.println(result2);
        int result3 = f.add(f.add(20, 20), 10);
        System.out.println(result);
    }
}
