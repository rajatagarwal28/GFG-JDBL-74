public class Student {
    private String password;
    private int age;
    private String name;
    private String gender;

    Student (int age){
        setAge(age);
    }

    private String encrypt(String key){
        return "encrypted token";
    }

    public String decrypt(String key){
        // logic to control access
        //logic to decrypt
        return "decrypted token";
    }

    public String getTokenOnAuth() {
        // logic to authenticate the user
        // controlled the access
        return encrypt(password);
    }

    private void setAge(int age) {
        //do some more stuff
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }



    //constructor
    //empty constructor
    Student() {}


    // user defined constructor
    Student(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    Student(String name) {
        this.name = name;
    }

    //copy constructor
    Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.gender = student.gender;
    }

}
