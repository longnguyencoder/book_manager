package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Rating> ratingsList;


    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH})
    private List<BookFavorite> bookFavoritesList;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name ="users_roles",
            joinColumns = @JoinColumn(name = "userID"),
            inverseJoinColumns = @JoinColumn(name = "role_Id")
    )
    private List<Roles> roles;
//    private List<Cart> cardList;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {
        CascadeType.DETACH,CascadeType.MERGE,
        CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Order> orderList;




}
