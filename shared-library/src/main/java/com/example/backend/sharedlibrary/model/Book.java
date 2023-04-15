package com.example.backend.sharedlibrary.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String ISBN;

    @Column(nullable = false)
    private String description;

    //TODO: Check if a book is able to have multiple categories with the current declaration
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryID", referencedColumnName = "CategoryId")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", referencedColumnName = "UserId")
    private User donatedBy;

    public Book(String bookName, String ISBN, String desc, Category cat, User donor){
        this.name = bookName;
        this.ISBN = ISBN;
        this.description = desc;
        this.category = cat;
        this.donatedBy = donor;
    }

    //TODO: ADD METHOD TO CHANGE STATUS
}
