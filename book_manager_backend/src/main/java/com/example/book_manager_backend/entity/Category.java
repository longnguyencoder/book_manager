package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.example.book_manager_backend.entity.Book;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;
    private String nameCategory;
//    một theer loai co nhieu sach
        @ManyToMany(fetch = FetchType.LAZY,cascade = {
        CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
        @JoinTable(
        name ="book_category",
        joinColumns = @JoinColumn(name = "idCategory"),
        inverseJoinColumns = @JoinColumn(name = "idBook")
)

    private List<Book> listBooks;


}
