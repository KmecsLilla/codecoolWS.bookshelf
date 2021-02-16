package com.codecool.bookshelf.model.feedback;

import lombok.*;

@AllArgsConstructor
public class Opinion {
    private final long id;
    private final long bookId;
    private final long userId;
    @Getter
    @Setter
    private String opinion;

    public Opinion(long id, long bookId, long userId) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
    }
}
