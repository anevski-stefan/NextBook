package com.example.backend.sharedlibrary.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WaitingList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RentId;

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "userId", nullable = false)
    private User user;

    @JoinColumn(name = "ISBN", referencedColumnName = "ISBN", nullable = false)
    private String ISBN;

    @Column
    private LocalDate dateQueued;

    public WaitingList(User user, String ISBN){
        this.user = user;
        this.ISBN = ISBN;
    }

}
