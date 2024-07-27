package OOPs;

public class Animal {
    // constructor is used to generate the object.
    private int age; // y unit of memory
    private String whichAnimal; // x unit of memory

    public void setAge(int age) {
        this.age = age;
    }

    //empty constructor
    //defualt constructor

    //user defined constructor
    Animal(String whichAnimal, int age) {
        this.whichAnimal = whichAnimal;
        this.age = age;
        System.out.println("constructor called");
        // call function
    }

    Animal(String whichAnimal) {
        this.whichAnimal = whichAnimal;
    }


    Animal(int age) {
        this.age = age;
    }

    Animal() {

    }



    public void eat() {
        System.out.println("Animal is Eating");
    }

    public void eat(String whatAnimalIsEating) {
        System.out.println("Animal is Eating");
    }

    // Public -> within class, outside the class, outside the package
    // private -> within class


    // protected -> within class, outside the class but with in the same package
    // outside the package if you are calling the function from the child class.

    // default -> within class, outside the class but with in the same package

}
