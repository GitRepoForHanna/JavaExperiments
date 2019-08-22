package books;

import java.util.ArrayList;
import java.util.List;

public class LibraryPart2 {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Russkaya izba",40));
        books.add(new Book("12 mesyacev", 160));
        books.add(new Book("Vaksa-klyaksa", 15));
        books.add(new Book("Pro chizjey", 11));
        books.add(new Book("Stihi pro les", 56));
        books.add(new Book("Prop Petyu i Tanyu", 200));
        books.add(new Book("Volshebnaya strana", 211));

        ArrayList<Author> authors = new ArrayList<Author>();

        authors.add(new Author("Ulyasheva", (short) 39));
        authors.add(new Author("Ivanov", (short) 41));
        authors.add(new Author("Marshak", (short) 67));
        authors.add(new Author("Mihalkov", (short)57));
        authors.add(new Author("Chizikov", (short)48));
        authors.add(new Author("Chizjikova", (short)47));

        books.get(0).addNewAuthor(authors.get(0));
        books.get(0).addNewAuthor(authors.get(1));
        books.get(1).addNewAuthor(authors.get(2));
        books.get(2).addNewAuthor(authors.get(2));
        books.get(3).addNewAuthor(authors.get(2));
        books.get(4).addNewAuthor(authors.get(3));
        books.get(5).addNewAuthor(authors.get(4));
        books.get(5).addNewAuthor(authors.get(5));
        books.get(6).addNewAuthor(authors.get(5));

//        authors.get(0).addNewBook(books.get(0));
//        authors.get(1).addNewBook(books.get(0));
//        authors.get(2).addNewBook(books.get(1));
//        authors.get(2).addNewBook(books.get(2));
//        authors.get(2).addNewBook(books.get(3));
//        authors.get(3).addNewBook(books.get(4));
//        authors.get(4).addNewBook(books.get(5));
//        authors.get(5).addNewBook(books.get(5));
//        authors.get(5).addNewBook(books.get(6));

        books.stream()
                .forEach(System.out::println);

        authors.stream()
                .forEach(System.out::println);







    }
}
