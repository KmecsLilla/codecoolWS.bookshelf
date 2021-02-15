package com.codecool.bookshelf.model.books;

public class PaperbackBook extends Book{
    private static final int GRAM_PER_PAGE = 10;
    private static final int GRAM_PER_COVER = 20;
    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages, GenreType genre) {
        super( title, author, releaseYear, numberOfPages, numberOfPages * GRAM_PER_PAGE + GRAM_PER_COVER, genre);
    }
}
