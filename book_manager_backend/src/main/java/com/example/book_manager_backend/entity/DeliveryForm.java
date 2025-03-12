package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "delivery")
@Data
public class DeliveryForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDeliveryForm;
    private String nameDelivery;
    private String description;
    private double costDelivery;

    @OneToMany(mappedBy = "deliveryForm",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
    private List<Order> orderList;
}
