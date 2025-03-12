package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bookFavorite")
public class BookFavorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBookFavorite;
    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "userID",nullable = false)
    private User user;
    // Một quyển sách có nhiều người yêu thích
    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "idBook",nullable = false)
    private Book book;

}
