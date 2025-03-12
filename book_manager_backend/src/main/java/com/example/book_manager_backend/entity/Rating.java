package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRating;

    private float ratingPoint;
    private String comment;

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
    @JoinColumn(name = "userID",nullable = false)
    private User user;

}
