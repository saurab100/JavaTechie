package org.java8.SortedBooksUsingLamba;

import java.util.ArrayList;
import java.util.List;

public class BooksDAO {

    public List<Books> getBooks() {
        List<Books> books = new ArrayList<>();
        books.add(new Books(101, "Azkaban"));
        books.add(new Books(99, "Chambers of Secret"));
        books.add(new Books(103, "Halloween"));
        return books;
    }

}
