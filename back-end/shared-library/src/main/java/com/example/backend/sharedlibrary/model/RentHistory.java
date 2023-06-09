package com.example.backend.sharedlibrary.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="BookID", referencedColumnName = "BookId")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "UserId")
    private User user;

    @Column(nullable = false)
    private LocalDate dateRented;

    @Column
    private LocalDate dateReturned = null;
    //This var is nullable because if a book is being rented by someone,
    //it is not yet returned, therefore the dateReturned is null
    
    public RentHistory(Book book, User user){
        this.book = book;
        this.user = user;
        this.dateRented = LocalDate.now();
    }
}
