package com.example.backend.sharedlibrary.service;

<<<<<<< HEAD
public interface ReviewService {
=======
import com.example.backend.sharedlibrary.model.Review;
import com.example.backend.sharedlibrary.model.User;

import java.util.List;

public interface ReviewService {
    List<Review> showForBook(String ISBN);
    List<Review> showFromUser(User user);
    Review create(User user, String ISBN, float score);
    Review create(User user, String ISBN, float score, String comment);
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
}
