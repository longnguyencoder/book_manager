package com.example.book_manager_backend.entity;

import java.util.List;

public class Book {
    private int idBook;
    private String titleBook;
    private String authorBook;
    private String ISBook; // ma so xuat ban cua the gioi
    private String description;
    private double priceFirst;
    private double priceSecond;
    private int quantity;
    private double average_rating; // xếp hạng trung binh cua cuon sch
    List<Category> listCategory ;
    List<ImageBook> imageBookList;
    List<Rating> ratingList;
    List<DetailOrder> detailOrdersList;
    List<DetailCard> detailCardList;
    List<BookFavorite> bookFavoriteList;


}
