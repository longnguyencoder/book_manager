package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.Category;
import com.example.book_manager_backend.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
