package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.Order;
import com.example.book_manager_backend.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
