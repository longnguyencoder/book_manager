package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="detail_Order")
public class DetailOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long detail_Order;

    private int quantity;
    private double price;
    // nhiều chi tiết đơn hàngthifif c nhiêều cuốn sách
    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "idBook",nullable = false)
    private Book book;

    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "order_id",nullable = false)
    private Order order;

}
