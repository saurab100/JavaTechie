package org.java8.SortedBooksUsingLamba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Books> getBooksInSort() {
        List<Books> books = new ArrayList<>();
        Collections.sort(books, (o1, o2) -> o2.getBookName().compareTo(o1.getBookName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

/*class MyComparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        return o2.getBookName().compareTo(o1.getBookName());
    }
}*/

