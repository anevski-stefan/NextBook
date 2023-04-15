package com.example.backend.sharedlibrary.web;
import com.example.backend.sharedlibrary.model.Category;
import com.example.backend.sharedlibrary.service.CategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CategoryRestController {
    private final CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> findAll() {
        return categoryService.listCategories();
    }
}
