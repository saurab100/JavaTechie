package org.java8.streamAPI;

import org.java8.DaoClasses.Books;
import org.java8.DaoClasses.BooksDAO;

import java.util.Collections;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {
        List<Books> books = BooksDAO.getBooks();

        //Using Lambdas
        Collections.sort(books, (o1, o2) -> o1.getBookName().compareTo(o2.getBookName()));
        System.out.println(books);

        //Using Stream API
        books.stream().sorted((o1, o2) -> o2.getBookPages() - o1.getBookPages()).forEach(System.out::println);
    }
}

//Traditional method of sorting a list according to a particular element
    /*public static void main(String[] args) {

        System.out.println(new SortingList().getBooks());
    }

    public List<Books> getBooks() {
        List<Books> books = BooksDAO.getBooks();
        Collections.sort(books, new MyComparator());
        return books;
    }
}

class MyComparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getBookPages() - o2.getBookPages();
    }
}*/

