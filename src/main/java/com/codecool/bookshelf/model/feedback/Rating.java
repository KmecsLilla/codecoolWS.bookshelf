package com.codecool.bookshelf.model.feedback;
import lombok.*;


@AllArgsConstructor
public class Rating {
    private final long id;
    private long bookId;
    private long userId;
    @Getter
    @Setter
    private int rating;


}
