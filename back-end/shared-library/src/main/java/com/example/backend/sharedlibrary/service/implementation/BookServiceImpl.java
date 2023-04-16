package com.example.backend.sharedlibrary.service.implementation;

<<<<<<< HEAD
public class BookServiceImpl {
=======
import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.Category;
import com.example.backend.sharedlibrary.model.User;
import com.example.backend.sharedlibrary.repository.BookRepository;
import com.example.backend.sharedlibrary.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book add(String bookName, String author, String ISBN, String img, Category cat, User donor) {
        Book book = new Book(bookName, author, ISBN, img, cat, donor);
        bookRepository.save(book);
        return book;
    }

    @Override
    public Book add(Book book){
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findISBN(String ISBN) {
        return Optional.of((Book) bookRepository.findAllByISBNLike(ISBN));
    }

    @Override
    public Optional<Book> findName(String Name) {
        return Optional.of((Book) bookRepository.findAllByNameLike(Name));
    }

    @Override
    public List<Book> findCategory(Category category) {
        return bookRepository.findAllByCategoryLike(category);
    }
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
}
