package com.example.backend.sharedlibrary.service.implementation;

<<<<<<< HEAD
<<<<<<< HEAD
public class ReviewServiceImpl {
=======
=======
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
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


<<<<<<< HEAD
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
=======
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
}
