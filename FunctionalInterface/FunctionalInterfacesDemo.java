package FunctionalInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfacesDemo {
    // it is way to write a statement into a function


    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Bangalore");


        java.util.function.Predicate<String> checkDelhiPredicate = city -> {
            return "Delhi".equals(city);
        };
        java.util.function.Predicate<String> checkMumbaiPredicate = city -> "Mumbai".equals(city);

        cities.stream().filter(checkDelhiPredicate.or(checkMumbaiPredicate)).forEach(city -> System.out.println(city));

        System.out.println("-----");

        cities.stream().filter(checkDelhiPredicate.negate()).forEach(city -> System.out.println(city));

        System.out.println("-----");

        Consumer<String> printConsumer = city -> {System.out.println(city);};

        System.out.println("-----");

        printConsumer.accept("Pune");

        System.out.println("-----");

        Function<String, Character> stringCharacterFunction = city -> city.charAt(0);
        Function<String, Character> stringCharacterFunction2 = city -> city.charAt(1);




        cities.stream().map(stringCharacterFunction).forEach(firstChar -> System.out.println(firstChar));
        System.out.println("-----");



        cities.stream().filter(checkDelhiPredicate.negate()).collect(Collectors.toUnmodifiableList());
        boolean output =  checkDelhiPredicate.test("Delhi");
        System.out.println(output);
        System.out.println("-----");

        Supplier<Double> getrandomValue = () -> Math.random();

        System.out.println(getrandomValue.get());
        System.out.println("-----");
        // predicate to identify is even or odd
        // Predicate to check whether the number is greater than 100
        //



//        for(String city : cities){
//            System.out.println(city);
//        }



//        Predicate<Integer> lesserThanTen = input ->(input < 10);
//
//        lesserThanTen.test(100);

    }

//    public void printCity(String city) {
//        System.out.println(city);
//    }






}
