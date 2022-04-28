package com.example.springrest.controller;

import com.example.springrest.model.BookModel;
import com.example.springrest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping
    public List<BookModel> getBooks() {
        return this.bookService.getBooks();
    }

    @PostMapping
    public BookModel createBook(@RequestBody BookModel bookModel) {
        return bookService.createBook(bookModel);
    }

    @DeleteMapping(path = "{bookId}")
    public void deleteBook(@PathVariable("bookId") Long id) {
        this.bookService.deleteBook(id);
    }
}
