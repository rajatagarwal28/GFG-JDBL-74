package Generics;


public class ObjectPrinter {
    Object things;
    public ObjectPrinter(Object things) {
        this.things = things;
    }

    public void print() {
        System.out.println(things);
    }
}