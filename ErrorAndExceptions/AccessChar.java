package ErrorAndExceptions;

public class AccessChar {
    String name = "ABC";

    public char getChar(int index) {

        return name.charAt(index);
        //java.lang.StringIndexOutOfBoundsException: Index 3 out of bounds for length 3


//
//        if(index < name.length()) {
//            return name.charAt(index);
//        } else {
//            System.out.println("you are trying to access an invalid character");
//            return name.charAt(0);
//        }

        try {
            return name.charAt(index);
        } catch (Exception e) {
            Error r

        }
    }
}
