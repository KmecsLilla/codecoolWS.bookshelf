package com.codecool.bookshelf;

public class PaperbackBook extends Book{
    private static final int GRAM_PER_PAGE = 10;
    private static final int GRAM_PER_COVER = 20;
    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super( title, author, releaseYear, numberOfPages, numberOfPages * GRAM_PER_PAGE + GRAM_PER_COVER);
    }
}
