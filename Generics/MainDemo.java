package Generics;

import java.util.ArrayList;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) {
        StringPrinter stringPrinter = new StringPrinter("abc");
        stringPrinter.print();

        ObjectPrinter objectPrinter = new ObjectPrinter(new Cat());
        objectPrinter.print();


//        Printer<String> printer = new Printer<>("asdfghj");
//        printer.print();
//        printer.setThings("sabjsabk");

//        Printer<Integer> intPrinter = new Printer<>(2345);
//        intPrinter.print();
//        intPrinter.setThings(123456);

        Printer<Cat> catPrinter = new Printer<>(new Cat());
        Printer<Dog> dogPrinter = new Printer<>(new Dog());




        List<String> list = new ArrayList<>();

//        printable("as", 1234);
//        printable(123, 12345);
//        printable(new Cat(), "saas");
        

        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();

        printable(cats);
        List<Integer> integers = new ArrayList<>();
    }

    private static void printable(List<? extends Animal> thing) {
        System.out.println("i am printing");
    }
}
