package com.example.book_manager_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name ="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idBook;
    private String titleBook;
    private String authorBook;
    private String ISBook; // ma so xuat ban cua the gioi
    private String description;
    private double priceFirst;
    private double priceSecond;
    private int quantity;
    private double average_rating; // xếp hạng trung binh cua cuon sch


    @ManyToMany(fetch = FetchType.LAZY,cascade = {
                    CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name ="book_category",
            joinColumns = @JoinColumn(name = "idBook"),
            inverseJoinColumns = @JoinColumn(name = "idCategory")
            )
    List<Category> listCategory ;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE // vì xóa đi 1 quyeenr sách th xóa đi hình ảnh cuủa nó

    })

    List<ImageBook> imageBookList;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE
    })
    List<Rating> ratingList;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    List<DetailOrder> detailOrdersList;
//    List<DetailCard> detailCardList;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
    List<BookFavorite> bookFavoriteList;


}
