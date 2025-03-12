package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private Date dob; // ngày tạo
    private String address_delivery; // địa chỉ giao hàng
    private String address_purchase ; // địa chỉ mua hnagf
    private double total_price_book; // chi phí sản phẩm
    private double delivery_costs; // chi phí giao hàng
    private double total_costs; // tổng tiền cần thanh toán
    private double total_final; // toongr tiền cuoois cung

    @OneToMany(mappedBy = "order",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
    private List<DetailOrder> listDetailOrders;

    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "userID",nullable = false)
    private User user;

    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "idPayment") // nullable l câu trả lowif cho quển sách không tồn tại thì hình ảnh cos toonf taạidđợc k

    private PaymentForm paymentForm;

    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "idDeliveryForm")
    private DeliveryForm deliveryForm;

}
