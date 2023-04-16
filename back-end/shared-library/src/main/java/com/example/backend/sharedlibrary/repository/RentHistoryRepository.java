package com.example.backend.sharedlibrary.repository;

import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.RentHistory;
import com.example.backend.sharedlibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RentHistoryRepository extends JpaRepository<RentHistory, Long> {
    List<RentHistory> findAllByUserLike(User user);
    List<RentHistory> findAllByBookLike(Book book);
<<<<<<< HEAD
<<<<<<< HEAD
=======
    List<RentHistory> findAllByISBNLike(String ISBN);
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
=======
    List<RentHistory> findAllByISBNLike(String ISBN);
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
    List<RentHistory> findAllByDateRented(LocalDate dateRented);
    List<RentHistory> findAllByDateReturned(LocalDate dateReturned);
}
