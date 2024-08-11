package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class _Stream {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abc", "DEF", "GHI", "PQR", "STU", "WXYZ");
        Consumer<String> customConsumer = name -> System.out.println(name);


        Stream<String> nameStream = names.stream();
        Predicate<String> isName = name -> name.startsWith("Abc");
        Stream<String> filterdNameStream = nameStream.filter(isName);
        filterdNameStream.forEach(customConsumer);



        customConsumer.accept("Rajat");

        names.forEach(customConsumer);



    }
}
