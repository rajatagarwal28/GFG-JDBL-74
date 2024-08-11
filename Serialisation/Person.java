package Serialisation;

import java.io.Serializable;

public class Person implements Serializable {
    private transient String Name;
    private transient int Age;

    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

}
