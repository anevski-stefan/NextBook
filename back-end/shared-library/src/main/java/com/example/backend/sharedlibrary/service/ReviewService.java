package com.example.backend.sharedlibrary.service;

<<<<<<< HEAD
<<<<<<< HEAD
public interface ReviewService {
=======
import com.example.backend.sharedlibrary.model.Review;
import com.example.backend.sharedlibrary.model.User;

import java.util.List;

public interface ReviewService {
=======
import com.example.backend.sharedlibrary.model.Review;
import com.example.backend.sharedlibrary.model.User;

import java.util.List;

public interface ReviewService {
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
    List<Review> showForBook(String ISBN);
    List<Review> showFromUser(User user);
    Review create(User user, String ISBN, float score);
    Review create(User user, String ISBN, float score, String comment);
<<<<<<< HEAD
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
=======
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
}
