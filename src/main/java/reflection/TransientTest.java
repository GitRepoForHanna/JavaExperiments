package reflection;

import java.io.*;

public class TransientTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Alex", "Nevskiy", 35);
        FileOutputStream fos = new FileOutputStream("personfile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);

        FileInputStream fis = new FileInputStream("personfile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person readPerson = (Person)ois.readObject();

        System.out.println("Person name " + person.getName());
        System.out.println("Person surname " + person.getSurname());
        System.out.println("Person age " + person.getAge());

        System.out.println("Read person name " + readPerson.getName());
        System.out.println("Read person surname " + readPerson.getSurname());
        System.out.println("Read person age " + readPerson.getAge());
    }
}
