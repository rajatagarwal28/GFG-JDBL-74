package FunctionalInterface;

public class ConvertStringIntoUpperCase implements StringProcessor {
    ConvertStringIntoUpperCase(){
    }

    @Override
    public String process(String input) {
        // to basically convery the string into uppercase
        return input.toUpperCase();
    }
}
