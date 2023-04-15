package com.example.backend.sharedlibrary.service;

import com.example.backend.sharedlibrary.model.User;

public interface UserService {
    User register(String username, String password, String repeatPassword, String name, String surname);
}
