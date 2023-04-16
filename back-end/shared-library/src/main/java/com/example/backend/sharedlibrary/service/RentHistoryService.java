package com.example.backend.sharedlibrary.service;

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
    RentHistory create(Book book, User user);
    List<RentHistory> listRentHistory();
    List<RentHistory> searchISBN(String ISBN);
    List<RentHistory> searchUser(User user);
    List<RentHistory> listRentedOnDate(LocalDate date);
    List<RentHistory> listReturnedOnDate(LocalDate date);
    Optional<RentHistory> searchBook(Book book);
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
}
