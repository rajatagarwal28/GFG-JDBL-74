package StaticAndFinal;

public class Main {
    public static void main(String[] args) {
        Static static1 = new Static();

        static1.updateName("name1");

        Static static2 = new Static();
        static2.updateName("name2");

        System.out.println(static1.getName());

        Static.printData();
        System.out.println(Static.name);


    }
}
