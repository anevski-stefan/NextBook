package com.example.backend.sharedlibrary.service.implementation;

<<<<<<< HEAD
public class RentHistoryServiceImpl {
=======

import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.RentHistory;
import com.example.backend.sharedlibrary.model.User;
import com.example.backend.sharedlibrary.repository.RentHistoryRepository;
import com.example.backend.sharedlibrary.service.RentHistoryService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class RentHistoryServiceImpl implements RentHistoryService {
    private final RentHistoryRepository rentHistoryRepository;

    public RentHistoryServiceImpl(RentHistoryRepository rentHistoryRepository){
        this.rentHistoryRepository = rentHistoryRepository;
    }
    @Override
    public RentHistory create(Book book, User user) {
        RentHistory rentHistory = new RentHistory(book, user);
        rentHistoryRepository.save(rentHistory);
        return rentHistory;
    }

    @Override
    public List<RentHistory> listRentHistory() {
        return rentHistoryRepository.findAll();
    }

    @Override
    public List<RentHistory> searchISBN(String ISBN) {
        return rentHistoryRepository.findAllByISBNLike(ISBN);
    }

    @Override
    public List<RentHistory> searchUser(User user) {
        return rentHistoryRepository.findAllByUserLike(user);
    }

    @Override
    public List<RentHistory> listRentedOnDate(LocalDate date) {
        return rentHistoryRepository.findAllByDateRented(date);
    }

    @Override
    public List<RentHistory> listReturnedOnDate(LocalDate date) {
        return rentHistoryRepository.findAllByDateReturned(date);
    }

    @Override
    public Optional<RentHistory> searchBook(Book book) {
        return Optional.of((RentHistory) rentHistoryRepository.findAllByBookLike(book));
    }
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
}
