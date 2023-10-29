package org.java8.SortedBooksUsingLamba;

import java.util.ArrayList;
import java.util.List;

public class BooksDAO {

    public static List<Books> getBooks() {
        List<Books> books = new ArrayList<>();
        books.add(new Books(101L, "Azkaban", 1000));
        books.add(new Books(999L, "Chambers of Secret", 5000));
        books.add(new Books(103L, "Halloween", 500));
        return books;
    }

}
