package com.example.backend.sharedlibrary.service.implementation;


import com.example.backend.sharedlibrary.model.User;
import com.example.backend.sharedlibrary.model.exceptions.InvalidUsernameOrPasswordException;
import com.example.backend.sharedlibrary.model.exceptions.PasswordsDoNotMatchException;
import com.example.backend.sharedlibrary.model.exceptions.UsernameAlreadyExistsException;
import com.example.backend.sharedlibrary.repository.UserRepository;
import com.example.backend.sharedlibrary.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(String username, String password, String repeatPassword, String name, String surname) {
        if (username==null || username.isEmpty()  || password==null || password.isEmpty()){
            throw new InvalidUsernameOrPasswordException();
        }
        if (!password.equals(repeatPassword)){
            throw new PasswordsDoNotMatchException();
        }
        if(this.userRepository.findByUsername(username).isPresent()){
            throw new UsernameAlreadyExistsException(username);
        }
        String encodedPassword = passwordEncoder.encode(password);
        User user = new User(name,surname,username,encodedPassword);
        return userRepository.save(user);
    }
}
