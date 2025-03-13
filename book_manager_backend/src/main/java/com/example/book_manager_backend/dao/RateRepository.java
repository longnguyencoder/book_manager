package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "rating")
public interface RateRepository extends JpaRepository<Rating, Long> {
}
