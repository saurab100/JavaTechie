package org.java8.SortedBooksUsingLamba;

import org.java8.DaoClasses.Books;
import org.java8.DaoClasses.BooksDAO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BookService {

    public List<Books> getBooksInSort() {
        List<Books> books = BooksDAO.getBooks();
        Collections.sort(books, new MyComparator());
        return books;
    } //(o1, o2) -> o2.getBookPages() - o1.getBookPages()

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

class MyComparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        return o2.getBookNo().compareTo(o1.getBookNo());
    }
}

