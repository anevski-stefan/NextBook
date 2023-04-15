package com.example.backend.sharedlibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "libraryUsers")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String username;

//    @Column(nullable = false, unique = true)
//    private String email;

    @Column(nullable = false)
    private String password;


    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
}
