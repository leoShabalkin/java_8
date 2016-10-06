package book;

import java.util.List;

/**
 * Created by Leonid_Shabalkin on 4/10/2016.
 */
public class Author {
    public final String name;
    public final short age;
    public final List<Book> books;

    public Author(String name, short age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
