package com.codecool.bookshelf.model.books;

public class HardcoverBook extends Book{
    private static final int GRAM_PER_PAGE = 10;
    private static final int GRAM_PER_COVER = 100;
    public HardcoverBook(long id, String title, String author, int releaseYear, int numberOfPages,GenreType genre) {
        super(id, title, author, releaseYear, numberOfPages, numberOfPages * GRAM_PER_PAGE + GRAM_PER_COVER,genre);
    }
}
