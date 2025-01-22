package com.eljabiry.movieservice.services.abstractions;

import com.eljabiry.movieservice.entities.Category;
import com.eljabiry.movieservice.repositories.CategoryRepository;

import java.util.List;

public interface CategoryService{
    List<Category> getAll();
}
