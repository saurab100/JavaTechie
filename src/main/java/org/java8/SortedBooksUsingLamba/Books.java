package org.java8.SortedBooksUsingLamba;


import java.util.Objects;

public class Books {

    public Books(int bookNo, String bookName) {
        this.bookNo = bookNo;
        this.bookName = bookName;
    }

    public int getBookNo() {
        return bookNo;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return bookNo == books.bookNo && Objects.equals(bookName, books.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookNo, bookName);
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private int bookNo;
    private String bookName;
}
