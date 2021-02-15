package com.codecool.bookshelf.model.user;

import com.codecool.bookshelf.model.books.Book;
import com.codecool.bookshelf.model.feedback.Opinion;
import com.codecool.bookshelf.model.feedback.Rating;

import java.util.Date;
import java.util.List;

public class Costumer {
    private static long idc=0;
    private final long id;
    private final String name;
    private final Date birthDate;
    private String email;
    private List<Book> wish;
    private List<Rating> ratings;
    private List<Opinion> opinions;

    public Costumer(String name, Date birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.id = idc++;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addWish(Book book){
        wish.add(book);
    }

    public List<Book> getWish() {
        return wish;
    }

    public void addRating(Rating rating){
        ratings.add(rating);
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void addOpinion(Opinion opinion){
        opinions.add(opinion);
    }

    public List<Opinion> getOpinions() {
        return opinions;
    }
}
