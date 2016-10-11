package book;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Leonid_Shabalkin on 4/10/2016.
 */
public class BookExample {
    public static void main(String[] args) {
        Author authors[] = new Author[3];
        Book mybooks[] = new Book[3];
        authors[0] = new Author("Stiv", (short) 10, Collections.singletonList(mybooks[0]));
        authors[1] = new Author("Mike", (short) 50, Arrays.asList(mybooks[1], mybooks[2]));
        authors[2] = new Author("Jack", (short) 30, Arrays.asList(mybooks[1], mybooks[2]));
        mybooks[0] = new Book("Java Complete Reference", Collections.singletonList(authors[0]), 10);
        mybooks[1] = new Book("Thinking in Java", Arrays.asList(authors[1], authors[2]), 300);
        mybooks[2] = new Book("Java for Dummies", Arrays.asList(authors[1], authors[2]), 210);

        System.out.println("Book size page >200:");
        Arrays.stream(mybooks).filter(b -> b.numberOfPages > 200).forEach(System.out::println);

        System.out.println("Max number of pages Book:");
        Optional<Book> maxBook = Arrays.stream(mybooks).max(getComporator());
        System.out.println(maxBook.map(Book::toString).orElse("Not found"));

        System.out.println("Min number of pages Book:");
        Optional<Book> minBook = Arrays.stream(mybooks).min(getComporator());
        System.out.println(minBook.map(Book::toString).orElse("Not found"));

        System.out.println("Book single author:");
        Arrays.stream(mybooks).filter(b -> b.authors.size() == 1).forEach(System.out::println);

        //sorted by title
        System.out.println("Sorted by title:");
        Arrays.stream(mybooks).sorted((b1, b2) -> b1.title.compareTo(b2.title)).forEach(System.out::println);


        Arrays.stream(authors).collect(Collectors.toCollection(ArrayList::new));


        System.out.println("Parallel:");
        List<Book> bookList = Arrays.stream(mybooks).parallel().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Book size page >200:");
        bookList.parallelStream().filter(b -> b.numberOfPages > 200).forEach(System.out::println);

        System.out.println("Max number of pages Book:");
        Optional<Book> maxBookParallel = bookList.parallelStream().max(getComporator());
        System.out.println(maxBookParallel.map(Book::toString).orElse("Not found"));

        System.out.println("Min number of pages Book:");
        Optional<Book> minBookParallel = bookList.parallelStream().min(getComporator());
        System.out.println(minBookParallel.map(Book::toString).orElse("Not found"));

        System.out.println("Book single author:");
        bookList.parallelStream().filter(b -> b.authors.size() == 1).forEach(System.out::println);

        //sorted by title
        System.out.println("Sorted by title:");
        System.out.println("1:");
        Arrays.parallelSort(mybooks, (b1, b2) -> b1.title.compareTo(b2.title));
        Arrays.stream(mybooks).forEach(System.out::println);
        System.out.println("2:");
        bookList.parallelStream().sorted((b1, b2) -> b1.title.compareTo(b2.title)).forEach(System.out::println);

        System.out.println("task 6:");
        bookList.stream().max(getComporator()).map(b -> b.authors).map(a -> a.stream().findFirst()).map(a -> a.isPresent() ? a.get().name : "EMTY").ifPresent(System.out::println);
    }

    private void a(Book b) {

    }

    private static Comparator<Book> getComporator() {
        return (b, b1) -> new Integer(b.numberOfPages).compareTo(b1.numberOfPages);
    }

}
