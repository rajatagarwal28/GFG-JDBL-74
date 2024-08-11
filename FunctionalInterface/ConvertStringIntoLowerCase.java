package FunctionalInterface;

public class ConvertStringIntoLowerCase implements StringProcessor {
    ConvertStringIntoLowerCase(){
    }

    @Override
    public String process(String input) {
        // to basically convery the string into uppercase
        return input.toLowerCase();
    }
}
