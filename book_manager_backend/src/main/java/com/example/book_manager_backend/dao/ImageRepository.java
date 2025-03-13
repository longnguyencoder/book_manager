package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.ImageBook;
import com.example.book_manager_backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "images")
public interface ImageRepository extends JpaRepository<ImageBook, Integer> {

    
}
