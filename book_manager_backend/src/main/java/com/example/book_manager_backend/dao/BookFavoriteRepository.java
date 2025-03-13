package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.BookFavorite;
import com.example.book_manager_backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookFavoriteRepository extends JpaRepository<BookFavorite, Integer> {

}
