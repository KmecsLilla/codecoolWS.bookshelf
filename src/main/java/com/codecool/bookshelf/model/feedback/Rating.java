package com.codecool.bookshelf.model.feedback;

public class Rating {
    private static long idc=0;
    private final long id;
    private long bookId;
    private long userId;
    private int rating;

    public Rating(long bookId, long userId, int rating) {
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
        this.id = idc++;
    }

    public long getBookId() {
        return bookId;
    }

    public long getUserId() {
        return userId;
    }

    public int getRating() {
        return rating;
    }
}
