
//TODO: MAKE THIS WORK
package com.example.backend.sharedlibrary.web;

import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping
public class BookRestController {
    private final BookService bookService;
    public BookRestController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> findALL(){
        return bookService.findAll();
    }

    @GetMapping("/book/{ISBN}")
    public Optional<Book> getBookByISBN(@PathVariable String ISBN){
        return bookService.findISBN(ISBN);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.add(book);
    }
    


}
