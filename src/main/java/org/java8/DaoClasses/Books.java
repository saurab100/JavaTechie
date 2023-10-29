package org.java8.DaoClasses;


import java.util.Objects;

public class Books {

    private Long bookNo;
    private String bookName;
    private int bookPages;

    public Long getBookNo() {
        return bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public Books(Long bookNo, String bookName, int bookPages) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookPages = bookPages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", bookPages=" + bookPages +
                '}';
    }
}
