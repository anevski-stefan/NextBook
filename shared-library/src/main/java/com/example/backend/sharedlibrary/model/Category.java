package com.example.backend.sharedlibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookCategory")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CategoryId;

    @Column(nullable = false)
    private String CategoryName;

    public Category(String name){
        this.CategoryName = name;
    }
}
