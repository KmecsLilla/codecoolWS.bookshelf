package com.codecool.bookshelf.model.books;

public class Book {
    private static long idc=0;
    private final long id;
    private final String title;
    private final String author;
    private final int releaseYear;
    private final int numberOfPages;
    private final int weightInGram;
    private final GenreType genre;

    public Book(String title, String author, int releaseYear, int numberOfPages, int weightInGram, GenreType genre) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.weightInGram = weightInGram;
        this.genre = genre;
        this.id = idc++;
    }

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

