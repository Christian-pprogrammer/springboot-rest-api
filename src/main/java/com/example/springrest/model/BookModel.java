package com.example.springrest.model;

public class BookModel {
    private Long id;
    private String bookName;
    private Long bookNumber;
    private String author;

    public BookModel() {
    }

    public BookModel(Long id, String bookName, Long bookNumber, String author) {
        this.id = id;
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.author = author;
    }

    public BookModel(String bookName, Long bookNumber, String author) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Long bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookNumber=" + bookNumber +
                ", author='" + author + '\'' +
                '}';
    }
}
