package Encapsulation;

public class Student {
    public String name;
    private String dob;
    public String gender;
    public int rollNumber;

    public String showDob() {
        return dob;
    }

    public void setDob(String dob) {
        // validate dob which is passed should be valid
        // check caller of the function is Admin
        this.dob = dob;
    }



    Student(String name, String dob, String gender, int rollNumber) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.rollNumber = rollNumber;
    }

}
