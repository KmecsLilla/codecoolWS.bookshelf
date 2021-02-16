package com.codecool.bookshelf.model.books;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
    private final long id;
    private final String title;
    private final String author;
    private final int releaseYear;
    private final int numberOfPages;
    private final int weightInGram;
    private final GenreType genre;



    public String getBookInfo(){
        return author+": "+title+" ("+releaseYear+")";
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getWeightInGram() {
        return weightInGram;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public GenreType getGenre() {
        return genre;
    }
}

