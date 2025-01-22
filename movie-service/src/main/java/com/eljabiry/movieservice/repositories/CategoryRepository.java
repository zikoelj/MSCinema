package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Category getCategoryByCategoryId(int categoryId);

}
