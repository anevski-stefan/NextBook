package com.example.backend.sharedlibrary.repository;

import com.example.backend.sharedlibrary.model.User;
import com.example.backend.sharedlibrary.model.WaitingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaitingListRepository extends JpaRepository<WaitingList, Long> {
    List<WaitingList> findAllByUserLike(User user);
    List<WaitingList> findAllByISBNLike(String ISBN);
}
