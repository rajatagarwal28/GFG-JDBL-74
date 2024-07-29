package ErrorAndExceptions;

public class DBNotFoundException extends Exception{
    public DBNotFoundException(String message) {
        super(message);
    }
}
