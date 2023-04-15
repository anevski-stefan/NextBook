package com.example.backend.sharedlibrary.service.implementation;

import com.example.backend.sharedlibrary.model.Category;
import com.example.backend.sharedlibrary.repository.CategoryRepository;
import com.example.backend.sharedlibrary.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(String name) {
        if (name==null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Category category = new Category(name);
        categoryRepository.save(category);
        return category;
    }

    @Override
    public Category update(String name) {
        if (name==null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Category category = new Category(name);
        categoryRepository.save(category);
        return category;
    }

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> searchCategories(String categoryName) {
        return categoryRepository.findAllByNameLike(categoryName);
    }
}
