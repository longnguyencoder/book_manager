package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.Order;
import com.example.book_manager_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Integer> {

}
