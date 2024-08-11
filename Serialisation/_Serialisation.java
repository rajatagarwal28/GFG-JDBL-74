package Serialisation;

import java.io.*;

public class _Serialisation {
    public static void main(String[] args) {
        Person person = new Person("John", 20);

//        FileInputStream fis = new FileInputStream("LocaltionOfFile.ser");
//        ObjectOutputStream ois = new ObjectOutputStream(fis);

        // serialise
        try {
            FileOutputStream fos = new FileOutputStream("LocaltionOfFile.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // de - serialise
        try {
            FileInputStream fis = new FileInputStream("LocaltionOfFile.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person deconstructedPerson = (Person) ois.readObject();
            System.out.println(deconstructedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
