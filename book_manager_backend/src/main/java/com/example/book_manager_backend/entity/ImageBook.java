package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "image_book")
public class ImageBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idImage;
    private String imageName;
    private boolean laIcon;
    private String imagePath;
    private String imageData;

    @ManyToOne(
            cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH
            }
    )
    @JoinColumn(name = "idBook", nullable = false) // nullable l câu trả lowif cho quển sách không tồn tại thì hình ảnh cos toonf taạidđợc k

    private Book book;
}
