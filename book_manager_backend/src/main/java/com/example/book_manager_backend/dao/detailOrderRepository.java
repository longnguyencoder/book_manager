package com.example.book_manager_backend.dao;


import com.example.book_manager_backend.entity.DetailOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface detailOrderRepository extends JpaRepository<DetailOrder, Long> {


}
