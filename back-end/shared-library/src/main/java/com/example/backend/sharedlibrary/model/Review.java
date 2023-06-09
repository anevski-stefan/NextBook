package com.example.backend.sharedlibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookReview")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ReviewID;

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "userId")
    private User user;

    //TODO: Make sure reviews will be tied to books, not individual copies
    @JoinColumn(name = "ISBN", referencedColumnName = "ISBN")
    private String ISBN;

    @Column(name = "score", nullable = false)
    private float score;

    @Column(name = "comment")
    private String comment;

    public Review(User user, String ISBN, float score) {
        this.user = user;
        this.ISBN = ISBN;
        this.score = score;
        this.comment = "";
    }

    public Review(User user, String ISBN, float score, String comment) {
        this.user = user;
        this.ISBN = ISBN;
        this.score = score;
        this.comment = comment;
    }
}