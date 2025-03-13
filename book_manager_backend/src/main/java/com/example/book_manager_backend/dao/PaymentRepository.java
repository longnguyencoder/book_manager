package com.example.book_manager_backend.dao;

import com.example.book_manager_backend.entity.Order;
import com.example.book_manager_backend.entity.PaymentForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentForm, Integer> {


}
