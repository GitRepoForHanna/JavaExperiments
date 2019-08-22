package books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Author {
    private String name;
    private short age;

    private List<Book> books = new ArrayList<Book>();

    public Author(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public Author(String name, short age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
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


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addNewBook(Book book) {
        if(!books.contains(book))
            books.add(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
