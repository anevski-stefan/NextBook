package com.example.backend.sharedlibrary.service;

<<<<<<< HEAD
<<<<<<< HEAD
public interface BookService {
=======
import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.Category;
import com.example.backend.sharedlibrary.model.User;

import java.util.List;
import java.util.Optional;

public interface BookService {
=======
import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.Category;
import com.example.backend.sharedlibrary.model.User;

import java.util.List;
import java.util.Optional;

public interface BookService {
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
    Book add(String bookName, String author, String ISBN, String img, Category cat, User donor);
    Book add(Book book);
    List<Book> findAll();
    Optional<Book> findISBN(String ISBN);
    Optional<Book> findName(String Name);
    List<Book> findCategory(Category category);
<<<<<<< HEAD
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
=======
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
}
