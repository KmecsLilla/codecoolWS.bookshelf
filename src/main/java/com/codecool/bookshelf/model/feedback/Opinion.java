package com.codecool.bookshelf.model.feedback;

public class Opinion {
    private static long idc=0;
    private final long id;
    private final long bookId;
    private final long userId;
    private String opinion;

    public Opinion(long bookId, long userId, String opinion) {
        this.bookId = bookId;
        this.userId = userId;
        this.opinion = opinion;
        this.id = idc++;
    }

    public long getBookId() {
        return bookId;
    }

    public long getUserId() {
        return userId;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
