package com.example.backend.sharedlibrary.service.implementation;

<<<<<<< HEAD
public class ReviewServiceImpl {
=======
import com.example.backend.sharedlibrary.model.Review;
import com.example.backend.sharedlibrary.model.User;
import com.example.backend.sharedlibrary.repository.ReviewRepository;
import com.example.backend.sharedlibrary.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;
    public ReviewServiceImpl(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> showForBook(String ISBN) {
        return reviewRepository.findAllByISBN(ISBN);
    }

    @Override
    public List<Review> showFromUser(User user) {
        return reviewRepository.findAllByUser(user);
    }

    @Override
    public Review create(User user, String ISBN, float score) {
        Review review = new Review(user, ISBN, score);
        reviewRepository.save(review);
        return review;
    }

    @Override
    public Review create(User user, String ISBN, float score, String comment) {
        Review review = new Review(user, ISBN, score, comment);
        reviewRepository.save(review);
        return review;
    }


>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
}
