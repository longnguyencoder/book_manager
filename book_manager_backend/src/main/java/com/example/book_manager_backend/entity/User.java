package com.example.book_manager_backend.entity;

import java.util.List;

public class User {
    private int userID;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private char gender;
    private String email;
    private String phone;
    private String address_delivery; // địa chỉ giao hàng
    private String address_purchase ; // địa chỉ mua hnagf
    private List<Rating> ratingsList;
    private List<BookFavorite> bookFavoritesList;
    private List<Roles> roles;
    private List<Cart> cardList;
    private List<Order> orderList;




}
