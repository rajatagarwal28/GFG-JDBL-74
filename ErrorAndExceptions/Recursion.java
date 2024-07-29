package ErrorAndExceptions;

public class Recursion {
    static long count = 1;
    public void print() {
        count++;
        while(count < 10000) {
            System.out.println("Hello World");
            print();
        }
    }
}
