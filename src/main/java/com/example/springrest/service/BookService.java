package com.example.springrest.service;

import com.example.springrest.model.BookModel;
import com.example.springrest.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<BookModel> getBooks() {
        return this.bookRepository.findAll();
    }
    public BookModel createBook(BookModel book) {

        this.bookRepository.save(book);
        return book;
    }
    public void deleteBook(Long id) {
        try{
            this.bookRepository.deleteById(id);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
