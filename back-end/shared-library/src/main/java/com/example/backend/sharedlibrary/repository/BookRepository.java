package com.example.backend.sharedlibrary.repository;

import com.example.backend.sharedlibrary.model.Book;
import com.example.backend.sharedlibrary.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByNameLike(String Name);
    List<Book> findAllByISBNLike(String ISBN);
    List<Book> findAllByCategoryLike(Category category);
    //TODO: FIND BOOK BY AUTHOR
    //List<Book> findAllByAuthorLike(String Author);
}
