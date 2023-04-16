package com.example.backend.sharedlibrary.repository;

import com.example.backend.sharedlibrary.model.Review;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.example.backend.sharedlibrary.model.User;
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
=======
import com.example.backend.sharedlibrary.model.User;
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByISBN(String ISBN);
<<<<<<< HEAD
<<<<<<< HEAD
=======
    List<Review> findAllByUser(User user);

>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
=======
    List<Review> findAllByUser(User user);

>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
}
