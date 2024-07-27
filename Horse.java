public class Horse extends Animal {
    public Horse() {
        System.out.println("horse is created");

    }

    @Override
    void eat() {
        System.out.println("horse eats");
    }

    @Override
    void sleep() {
        System.out.println("horse sleeps");
    }

}
