package com.example.backend.sharedlibrary.service;


import com.example.backend.sharedlibrary.model.User;
import com.example.backend.sharedlibrary.model.WaitingList;

import java.util.List;

public interface WaitingListService {
    WaitingList create(User user, String ISBN);
    List<WaitingList> listWaitingList();
    List<WaitingList> searchISBN(String ISBN);
    List<WaitingList> searchUser(User user);

    boolean removeFromList(User user);

}
