package com.codecool.bookshelf.model.books;

public enum GenreType {
    DRAMA("Drama"),
    FICTION("Fiction"),
    NONFICTION("NonFiction"),
    SCIFI("Science Fiction"),
    FANTASY("Fantasy"),
    HISTORY("History"),
    CLASSIC("Classic");

    private final String genreName;

    GenreType(String tileName) {
        this.genreName = tileName;
    }

    public String getGenreName() {
        return genreName;
    }
}
