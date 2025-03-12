package com.example.book_manager_backend.entity;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.sql.Date;
import java.util.List;

public class Order {
    private int order_id;
    private Date dob; // ngày tạo
    private String address_delivery; // địa chỉ giao hàng
    private String address_purchase ; // địa chỉ mua hnagf
    private double total_price_book; // chi phí sản phẩm
    private double delivery_costs; // chi phí giao hàng
    private double total_costs; // tổng tiền cần thanh toán
    private double total_final; // toongr tiền cuoois cung
    private List<DetailOrder> list_detail_orders;
    private User user;
    private PaymentForm paymentForm;
    private DeliveryForm deliveryForm;

}
