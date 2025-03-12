package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "payment")
@Data
public class PaymentForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayment;
    private String namePayment;
    private String description;
    private double costPayment;

    @OneToMany(mappedBy = "paymentForm",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
    private List<Order> orderList;

}
