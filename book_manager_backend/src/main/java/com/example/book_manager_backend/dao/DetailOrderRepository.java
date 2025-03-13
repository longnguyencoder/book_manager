package com.example.book_manager_backend.dao;


import com.example.book_manager_backend.entity.DetailOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "orders-detail")
public interface DetailOrderRepository extends JpaRepository<DetailOrder, Long> {


}
