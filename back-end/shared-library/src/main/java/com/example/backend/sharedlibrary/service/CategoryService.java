package com.example.backend.sharedlibrary.service;

import com.example.backend.sharedlibrary.model.Category;

import java.util.List;

public interface CategoryService {
    Category create(String name);
    Category update(String name);
    List<Category> listCategories();
    List<Category> searchCategories(String categoryName);
}
