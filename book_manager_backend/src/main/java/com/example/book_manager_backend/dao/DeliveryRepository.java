package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.DeliveryForm;
import com.example.book_manager_backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryForm, Integer> {

}
