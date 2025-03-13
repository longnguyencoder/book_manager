package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends JpaRepository<Rating, Long> {
}
