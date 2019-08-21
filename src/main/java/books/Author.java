package books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Author {
    private String name;
    private short age;
//    private List<Book> books;

    public Author(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                  '}';
    }
}
