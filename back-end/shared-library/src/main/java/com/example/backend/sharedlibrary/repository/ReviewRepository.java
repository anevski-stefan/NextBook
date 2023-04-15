package com.example.backend.sharedlibrary.repository;

import com.example.backend.sharedlibrary.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByISBN(String ISBN);
}
