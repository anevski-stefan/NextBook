package com.example.backend.sharedlibrary.repository;

import com.example.backend.sharedlibrary.model.Book;
<<<<<<< HEAD
=======
import com.example.backend.sharedlibrary.model.Category;
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByNameLike(String Name);
    List<Book> findAllByISBNLike(String ISBN);
<<<<<<< HEAD
=======
    List<Book> findAllByCategoryLike(Category category);
>>>>>>> 0a1b2b9f73634d1f93d1365cb97ce34d108fec76
    //TODO: FIND BOOK BY AUTHOR
    //List<Book> findAllByAuthorLike(String Author);
}
