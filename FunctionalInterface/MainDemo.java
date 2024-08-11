package FunctionalInterface;

import java.util.function.BiFunction;

public class MainDemo {
    public static void main(String[] args) {
        ConvertStringIntoLowerCase lowerCase = new ConvertStringIntoLowerCase();
        System.out.println(lowerCase.process("Rajat"));
        System.out.println("------");

        StringProcessor toUpperCase = input -> input.toUpperCase();

        System.out.println(toUpperCase.process("Rajat"));

        StringProcessor addPrefix = (input) -> "Prefix" + input;


        StringProcessor toLowerCase = input -> {
            System.out.println("ssbdsjd");
            return input.toLowerCase();};

        System.out.println(toLowerCase.process("Rajat"));

        AdditionFunctionalityOfCalculator additionFunctionalityOfCalculator = new AdditionFunctionalityOfCalculator();
        int resultOfAddition = additionFunctionalityOfCalculator.performOperation(10, 20);
        System.out.println(resultOfAddition);

        CalculatorFunctionalityI subtractionOperation = (firstInput, secondInput) -> firstInput-secondInput;
        int resultOfSubtraction = subtractionOperation.performOperation(100, 20);
        System.out.println(resultOfSubtraction);


        CalculatorFunctionalityI divideOperation = (i, j) -> {return i/j;};
        int resultOfDivision = divideOperation.performOperation(100, 10);


        CalculatorFunctionalityI multiply = (i, j) -> i*j;
        int resultOFmultoplicat = multiply.performOperation(100, 10);


        BiFunction<Integer,Integer,Integer> multiplicationFunc = (a, b) -> a*b;
        multiplicationFunc.apply(5,6);



        // lambda expression to anonymous function




    }



}
