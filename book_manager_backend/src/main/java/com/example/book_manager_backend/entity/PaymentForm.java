package com.example.book_manager_backend.entity;

import java.util.List;

public class PaymentForm {
    private int idPayment;
    private String namePayment;
    private String description;
    private double costPayment;
    private List<Order> orderList;

}
