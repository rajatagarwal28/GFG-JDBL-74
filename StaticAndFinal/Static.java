package StaticAndFinal;

public class Static {
    public  static String name;
    public void updateName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public static void printData() {
        System.out.println("I am static function");

    }
}
