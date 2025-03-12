package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "roles")
@Data
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_Id;
    private String role_Name;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name ="users_roles",
            joinColumns = @JoinColumn(name = "role_Id"),
            inverseJoinColumns = @JoinColumn(name = "userID")
    )
    List<User> list_user;
}
