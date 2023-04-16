package com.example.backend.sharedlibrary.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

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

<<<<<<< HEAD
=======
    @Column(nullable = false)
>>>>>>> 7248a73 (Add Waiting List model, repository, service and service implementation. Add Book repository, service and service implementation. Edit Book to add Author. Add Rent History repository, service and service implementation. Add BookRestController. Add RentHistoryController.)
    private String ISBN;

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "UserId")
    private User user;

    private LocalDate dateRented;

    @Column
    private LocalDate dateReturned = null;
    //This var is nullable because if a book is being rented by someone,
    //it is not yet returned, therefore the dateReturned is null
    
    public RentHistory(Book book, User user){
        this.book = book;
        this.user = user;
        this.dateRented = LocalDate.now();
        ISBN = book.getISBN();
    }

    // ???
    public Object getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Object dateReturned) {
        this.dateReturned = (LocalDate) dateReturned;
    }
}
