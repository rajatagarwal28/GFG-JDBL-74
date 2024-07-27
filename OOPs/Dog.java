package OOPs;

public class Dog {

    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 24);// x+y unit of memory is required
        animal.setAge(30);


        Animal animal4 = new Animal();

        Animal animal2 = new Animal("Dogwithoutage");// x+y unit of memory is required

        Animal animal3 = new Animal(20);// x+y unit of memory is required

        // c++-> deallocate()
        // Java -> garbage collector -> using this, gc deallocates the memory if not needed and destroy the object.

        // new -> this keyword means memory is allocated for the object.


        animal.eat();
    }

}
