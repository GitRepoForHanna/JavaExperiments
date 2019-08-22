package books;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class LibraryMain {

    public static void main(String[] args) {

        List<Author>authors = Arrays.asList(
            new Author("Ulyasheva", (short) 39),
                new Author("Ivanov", (short) 41),
                new Author("Marshak", (short) 67),
                new Author("Mihalkov", (short)57),
                new Author("Chizikov", (short)48),
                new Author("Chizjikova", (short)47));

        List<Book> books = Arrays.asList(
                new Book("Russkaya izba",40),
                new Book("12 mesyacev", 160),
                new Book("Vaksa-klyaksa", 15),
                new Book("Pro chizjey", 11),
                new Book("Stihi pro les", 56),
                new Book("Prop Petyu i Tanyu", 200),
                new Book("Volshebnaya strana", 211));

        books.get(0).setAuthors(Arrays.asList(authors.get(0),authors.get(1)));
        books.get(1).setAuthors(Arrays.asList(authors.get(2)));
        books.get(2).setAuthors(Arrays.asList(authors.get(2)));
        books.get(3).setAuthors(Arrays.asList(authors.get(2)));
        books.get(4).setAuthors(Arrays.asList(authors.get(3)));
        books.get(5).setAuthors(Arrays.asList(authors.get(4)));
        books.get(6).setAuthors(Arrays.asList(authors.get(5)));



        System.out.println("\nAll books have more than 200 pages: " + books.stream().allMatch(b -> b.getPagesCount() > 200));
        System.out.println("\nSome book has more than 200 pages: " + books.stream().anyMatch(b -> b.getPagesCount() > 200));
        System.out.println("\nMax pages count: " + books.stream().max(comparing(Book::getPagesCount)));
        System.out.println("\nMin pages count: " + books.stream().min(comparing(Book::getPagesCount)));

        System.out.println("\nThese books have only 1 author:");
        books.stream().parallel().filter(b -> b.getAuthors().size() == 1).forEach(System.out::println);

        System.out.println("\nThese books are sorted by number of pages:");
        books.stream()
                .sorted(comparing(Book::getPagesCount))
                .forEach(System.out::println);

        System.out.println("\nBooks are sorted by title:");
        books.stream()
                .sorted(comparing(Book::getTitle))
                .forEach(System.out::println);

        System.out.println("\nBook titles:");
        books.stream()
                .distinct()
                .map(b -> b.getTitle())
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nList of authors:");
        books.stream()
                .map(b -> b.getAuthors().stream())
                .forEach(a -> a.forEach(System.out::println));
    }


}
