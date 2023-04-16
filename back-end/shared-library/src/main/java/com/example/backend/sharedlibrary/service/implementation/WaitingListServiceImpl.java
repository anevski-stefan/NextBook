package com.example.backend.sharedlibrary.service.implementation;

import com.example.backend.sharedlibrary.model.User;
import com.example.backend.sharedlibrary.model.WaitingList;
import com.example.backend.sharedlibrary.service.WaitingListService;
import com.example.backend.sharedlibrary.repository.WaitingListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaitingListServiceImpl implements WaitingListService {
    private final WaitingListRepository waitingListRepository;
    public WaitingListServiceImpl(WaitingListRepository waitingListRepository) {
        this.waitingListRepository = waitingListRepository;
    }
    @Override
    public WaitingList create(User user, String ISBN) {
        WaitingList waitingList = new WaitingList(user, ISBN);
        waitingListRepository.save(waitingList);
        return waitingList;
    }

    @Override
    public List<WaitingList> listWaitingList() {
        return waitingListRepository.findAll();
    }

    @Override
    public List<WaitingList> searchISBN(String ISBN) {
        return waitingListRepository.findAllByISBNLike(ISBN);
    }

    @Override
    public List<WaitingList> searchUser(User user) {
        return waitingListRepository.findAllByUserLike(user);
    }

    @Override
    public boolean removeFromList(User user) {
        return waitingListRepository.findAllByUserLike(user).remove(this);
    }

}
