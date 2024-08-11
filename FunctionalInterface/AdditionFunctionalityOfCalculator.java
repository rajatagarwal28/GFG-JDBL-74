package FunctionalInterface;

public class AdditionFunctionalityOfCalculator implements CalculatorFunctionalityI{
    @Override
    public int performOperation(int a, int b) {
        return a+b;
    }
}
