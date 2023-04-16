package com.example.backend.sharedlibrary.service;

<<<<<<< HEAD
<<<<<<< HEAD
public interface RentHistoryService {
=======
import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.RentHistory;
import com.example.backend.sharedlibrary.model.User;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RentHistoryService {
=======
import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.RentHistory;
import com.example.backend.sharedlibrary.model.User;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RentHistoryService {
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
    RentHistory create(Book book, User user);
    List<RentHistory> listRentHistory();
    List<RentHistory> searchISBN(String ISBN);
    List<RentHistory> searchUser(User user);
    List<RentHistory> listRentedOnDate(LocalDate date);
    List<RentHistory> listReturnedOnDate(LocalDate date);
    Optional<RentHistory> searchBook(Book book);
<<<<<<< HEAD
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
=======
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
}
