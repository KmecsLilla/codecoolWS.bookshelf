package com.codecool.bookshelf.model.user;

import com.codecool.bookshelf.model.books.Book;
import com.codecool.bookshelf.model.feedback.Opinion;
import com.codecool.bookshelf.model.feedback.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
public class Costumer {
    private final long id;
    private String name;
    private Date birthDate;
    private String email;
    private List<Book> wish;
    private List<Rating> ratings;
    private List<Opinion> opinions;

    public Costumer(long id, String name, Date birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.id = id;
    }

    public void addWish(Book book){
        wish.add(book);
    }

    public void addRating(Rating rating){
        ratings.add(rating);
    }

    public void addOpinion(Opinion opinion){
        opinions.add(opinion);
    }


}
