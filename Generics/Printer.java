package Generics;

import java.io.Serializable;

public class Printer <T extends Animal> {
    public T getThings() {
        return things;
    }

    public void setThings(T things) {
        this.things = things;
    }

    T things;
    public Printer(T things) {
        this.things = things;
    }

    public void print() {
        System.out.println(things);
    }


}
