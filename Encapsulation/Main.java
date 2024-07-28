package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rajat", "96", "male", 1234567);
//        System.out.println(s1.dob);
//        s1.dob = "2000";
        String mydob = s1.showDob();
        System.out.println(s1.showDob());

    }
}
