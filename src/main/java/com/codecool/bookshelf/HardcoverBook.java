package com.codecool.bookshelf;

public class HardcoverBook extends Book{
    private static final int GRAM_PER_PAGE = 10;
    private static final int GRAM_PER_COVER = 100;
    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super( title, author, releaseYear, numberOfPages, numberOfPages * GRAM_PER_PAGE + GRAM_PER_COVER);
    }
}
