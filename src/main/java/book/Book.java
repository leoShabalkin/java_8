package book;

import java.util.List;

/**
 * Created by Leonid_Shabalkin on 4/10/2016.
 */
public class Book {
    public final String title;
    public final List<Author> authors;
    public final int numberOfPages;

    public Book(String title, List<Author> authors, int numberOfPages) {
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
